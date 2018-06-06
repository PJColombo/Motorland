package Integración.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Integración.Alquiler.DAOAlquiler;
import Integración.DAOFactory.DaoFactory;
import Integración.Transaction.Transaction;
import Integración.Transaction.TransactionManager;
import Negocio.Cliente.TCliente;

public class ClienteAlquilerMasCostoso implements Query {

	@Override
	public Object execute(Object data) throws Exception {
		Transaction tr = null; 
		Connection cn = null; 
		PreparedStatement ps = null;
		ResultSet rs = null; 
		DAOAlquiler daoA = DaoFactory.getInstance().createDAOAlquiler();
		String forUpdate = " FOR UPDATE";
		TCliente c = null; 
		int idClienteVIP; 
		try {
			tr = TransactionManager.getInstance().getTransaction();
			cn = (Connection) tr.getResource();
			ps = cn.prepareStatement("SELECT idCliente, MAX(costeTotal FROM alquiler" + forUpdate);
			rs = ps.executeQuery();
			if(rs.next()) {
				idClienteVIP = rs.getInt(1);
				
				ps = cn.prepareStatement("SELECT * FROM cliente WHERE idcliente = ?" + forUpdate);
				ps.setInt(1, idClienteVIP);
				rs = ps.executeQuery();
				if(rs.next())
					c = new TCliente(idClienteVIP, rs.getString(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getBoolean(6));
			}
		}
		finally {
			if(ps != null)
				ps.close();
			if(rs != null)
				rs.close();
		}
		return c;
	}

}
