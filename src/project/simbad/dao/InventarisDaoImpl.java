package project.simbad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.simbad.model.inventaris;
public class inventarisDAOImpl implements inventarisDAO{
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement UpdateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getAllStatement;
	
	private final String INSERT_QUERY = "INSERT INTO inventaris(id_inventaris,nama,qty_total,qty_baik,qty_rusak) VALUES(?,?,?,?,?)";
	private final String UPDATE_QUERY = "UPDATE inventaris SET nama=?, qty_total=?, qty_baik=?, qty_rusak=?, id_inventaris=?";
	private final String DELETE_QUERY = "DELETE FROM inventaris WHERE id_inventaris=?";
	private final String GET_BY_ID_QUERY = "SELECT id_inventaris,nama,qty_total,qty_baik,qty_rusak FROM inventaris WHERE id_inventaris=?";
	private final String GET_ALL_QUERY ="SELECT id_inventaris,nama,qty_total,qty_baik,qty_rusak FROM inventaris";
	
	public void setConnection(Connection connection) throws SQLException{
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		UpdateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement = this.connection.prepareStatement(DELETE_QUERY);
		getByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
		
	}
		
	public inventaris saveOrUpdate(inventaris inventaris, boolean isUpdate) throws SQLException {
		if (!isUpdate) {
			insertStatement.setString(1, inventaris.getId_inventaris());
			insertStatement.setString(2, inventaris.getNama());
			insertStatement.setInt(3, inventaris.getQty_total());
			insertStatement.setInt(4, inventaris.getQty_baik());
			insertStatement.setInt(5, inventaris.getQty_rusak());
			insertStatement.executeUpdate();
			} else {
			UpdateStatement.setString(1, inventaris.getNama());
			UpdateStatement.setInt(2, inventaris.getQty_total());
			UpdateStatement.setInt(3, inventaris.getQty_baik());
			UpdateStatement.setInt(4, inventaris.getQty_rusak());
			UpdateStatement.setString(3, inventaris.getId_inventaris());
			UpdateStatement.executeUpdate();
			}
		// TODO Auto-generated method stub
		return inventaris;
	}
	
	@Override
	public inventaris delete(inventaris inventaris) throws SQLException {
		// TODO Auto-generated method stub
		deleteStatement.setString(1, inventaris.getId_inventaris());
		deleteStatement.executeUpdate();
		return inventaris;
	}
	@Override
	public inventaris getById(String nim) throws SQLException {
		// TODO Auto-generated method stub
		getByIdStatement.setString(1, nim);
		ResultSet rs = getByIdStatement.executeQuery();
		if (rs.next()) {
		inventaris inventaris = new inventaris();
		inventaris.setId_inventaris(rs.getString("Id_inventaris"));
		inventaris.setNama(rs.getString("nama"));
		inventaris.setQty_total(rs.getInt("qty_total"));
		inventaris.setQty_baik(rs.getInt("Qty_baik"));
		inventaris.setQty_rusak(rs.getInt("Qty_rusak"));
		return inventaris;
		}
		return null;
	}

	@Override
	public List<inventaris> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<inventaris> inventaris = new ArrayList<inventaris>();
		ResultSet rs = getAllStatement.executeQuery();
		while(rs.next()){
		inventaris m = new inventaris();
		m.setId_inventaris(rs.getString("Id_inventaris"));
		m.setNama(rs.getString("nama"));
		m.setQty_total(rs.getInt("Qty_total"));
		m.setQty_baik(rs.getInt("Qty_baik"));
		m.setQty_rusak(rs.getInt("Qty_rusak"));
		inventaris.add(m);
		}
		return inventaris;
	
	}

	@Override
	public inventaris saveOrUpdate(inventaris inventaris) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
