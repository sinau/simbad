package project.simbad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.simbad.model.RegistrasiItem;

public class RegistrasiItemDAOImpl implements RegistrasiItemDAO{
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getAllStatement;
	
	private final String INSERT_QUERY = "insert into Registrasi_Item (id_rs, id_item)values(?,?)";
	private final String UPDATE_QUERY = "update Registrasi_Item set id_item where id_rs=?";
	private final String DELETE_QUERY = "delete from Registrasi_Item where id_rs=?";
	private final String GET_BY_ID_QUERY = "select id_rs, id_item from Registrasi_Item where id_rs=?";
	private final String GET_ALL_QUERY = "select id_rs, id_item from Registrasi_Item";
	
	public void setConnection(Connection connection) throws SQLException{
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		updateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement = this.connection.prepareStatement(DELETE_QUERY);
		getByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
	}

	@Override
	public RegistrasiItem saveOrUpdate(RegistrasiItem registrasiItem,
			boolean isUpdate) throws SQLException {
		if(!isUpdate){
			insertStatement.setString(1, registrasiItem.getIdRegistrasi());
			insertStatement.setString(2, registrasiItem.getIdItem());
		} else {
			updateStatement.setString(1, registrasiItem.getIdItem());
		}
		return registrasiItem;
	}

	@Override
	public RegistrasiItem delete(RegistrasiItem registrasiItem)
			throws SQLException {
		deleteStatement.setString(1, registrasiItem.getIdRegistrasi());
		return registrasiItem;
	}

	@Override
	public RegistrasiItem getById(String idRegistrasi) throws SQLException {
		getByIdStatement.setString(1, idRegistrasi);
		ResultSet rs = getByIdStatement.executeQuery();
		
		if(rs.next()){
			RegistrasiItem registrasItem = new RegistrasiItem();
			registrasItem.setIdItem(rs.getString("id_rs"));
			registrasItem.setIdRegistrasi(rs.getString("id_item"));
			
			return registrasItem;
		}
		return null;
	}

	@Override
	public List<RegistrasiItem> getAll() throws SQLException {
		List<RegistrasiItem> registrasiItem = new ArrayList<RegistrasiItem>();
		ResultSet rs = getAllStatement.executeQuery();
		while (rs.next()){
			RegistrasiItem rI = new RegistrasiItem();
			rI.setIdRegistrasi(rs.getString("id_registrasi"));
			rI.setIdItem(rs.getString("id_item"));
			
			registrasiItem.add(rI);
		}
		return registrasiItem;
	}
	
	

}
