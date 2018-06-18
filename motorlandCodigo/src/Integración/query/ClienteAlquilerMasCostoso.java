package Integración.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Integración.Transaction.Transaction;
import Integración.Transaction.TransactionManager;
import Negocio.Alquiler.TAlquiler;
import Negocio.Cliente.TCliente;

public class ClienteAlquilerMasCostoso implements Query {

	@SuppressWarnings("resource")
	@Override
	public Object execute(Object data) throws Exception {
		Transaction tr = null; 
		Connection cn = null; 
		PreparedStatement ps = null;
		ResultSet rs = null; 
		String forUpdate = " FOR UPDATE";
		ArrayList<VIPResultado> clientes = null; 
		TAlquiler t; 
		int idClienteVIP; 
		try {
			tr = TransactionManager.getInstance().getTransaction();
			cn = (Connection) tr.getResource();
			ps = cn.prepareStatement("SELECT idCliente, costeTotal, idAlquiler from alquiler WHERE costeTotal IN (SELECT MAX(costeTotal) FROM alquiler)" + forUpdate);
			rs = ps.executeQuery();
			clientes = new ArrayList<>();
			while(rs.next()) {
				idClienteVIP = rs.getInt(1);
				t = new TAlquiler(rs.getInt(3), -1, null, null, rs.getDouble(2), null, true);
				ps = cn.prepareStatement("SELECT * FROM cliente WHERE idcliente = ?" + forUpdate);
				ps.setInt(1, idClienteVIP);
				rs = ps.executeQuery();
				if(rs.next()) {
					TCliente c = new TCliente(idClienteVIP, rs.getString(2), rs.getString(3), 
							rs.getString(4), rs.getLong(5), rs.getBoolean(6)); 
					clientes.add(new VIPResultado(c, t));
				}
					
			}
		}
		finally {
			if(ps != null)
				ps.close();
			if(rs != null)
				rs.close();
		}
		return clientes;
	}

}
