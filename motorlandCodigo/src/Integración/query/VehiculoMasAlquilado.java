package Integración.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Integración.Alquiler.DAOAlquiler;
import Integración.DAOFactory.DaoFactory;
import Integración.Transaction.Transaction;
import Integración.Transaction.TransactionManager;
import Negocio.Vehiculo.TVehiculo;

public class VehiculoMasAlquilado implements Query {

	@Override
	public Object execute(Object data) throws Exception {
		Transaction tr = null; 
		Connection cn = null; 
		PreparedStatement ps = null;
		ResultSet rs = null; 
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		String forUpdate = " FOR UPDATE";
		TVehiculo v = null; 
		int idVIP; 
		try {
			tr = TransactionManager.getInstance().getTransaction();
			cn = (Connection) tr.getResource();
			ps = cn.prepareStatement("SELECT idVehiculo FROM lineaalquiler GROUP BY idVehiculo "
					+ "ORDER BY COUNT(*) DESC LIMIT 1" + forUpdate);
			rs = ps.executeQuery();
			
			idVIP = rs.getInt(1);
			
			ps = cn.prepareStatement("SELECT * FROM vehiculo WHERE idvehiculo = ?" + forUpdate);
			ps.setInt(1, idVIP);
			rs = ps.executeQuery();
			
			v = new TVehiculo(idVIP, rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getBoolean(7));
		}
		finally {
			if(ps != null)
				ps.close();
			if(rs != null)
				rs.close();
		}
		return v;
	}

}
