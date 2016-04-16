package project.simbad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.simbad.model.Item;
import project.simbad.model.Registrasi;

public class ItemDAOImpl implements ItemDAO {
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getAllStatement;

	private final String INSERT_QUERY = "insert into item (Id_item, nama_item, Column)values(?,?,?)";
	private final String UPDATE_QUERY = "update item set nama_item=?, Column=? where Id_item=?";
	private final String DELETE_QUERY = "delete from item where Id_item=?";
	private final String GET_BY_ID_QUERY = "select Id_item,nama_item,Column from item where Id_item=?";
	private final String GET_ALL_QUERY = "select Id_item,nama_item,Column from item";
	
	public void setConnection(Connection connection) throws SQLException{
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		updateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement = this.connection.prepareStatement(DELETE_QUERY);
		getByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
	}

	@Override
	public Item saveOrUpdate(Item item, boolean isUpdate) throws SQLException {
		if (!isUpdate) {
			insertStatement.setString(1, item.getIdItem());
			insertStatement.setString(2, item.getNamaItem());
			insertStatement.setString(3, item.getColumn());
			insertStatement.executeUpdate();
		} else {
			updateStatement.setString(1, item.getNamaItem());
			updateStatement.setString(2, item.getColumn());
			updateStatement.executeUpdate();
		}
		return item;
	}

	@Override
	public Item delete(Item item) throws SQLException {
		deleteStatement.setString(1, item.getIdItem());
		deleteStatement.executeUpdate();
		return item;
	}

	@Override
	public Item getById(String idItem) throws SQLException {
		getByIdStatement.setString(1, idItem);
		ResultSet rs = getByIdStatement.executeQuery();

		if (rs.next()) {
			Item item = new Item();
			item.setIdItem(rs.getString("Id_item"));
			item.setNamaItem(rs.getString("nama_item"));
			item.setColumn(rs.getString("Column"));

			return item;
		}
		return null;
	}

	@Override
	public List<Item> getAll() throws SQLException {
		List<Item> item = new ArrayList<Item>();
		ResultSet rs = getAllStatement.executeQuery();
		while (rs.next()){
			Item i = new Item();
			i.setIdItem(rs.getString("Id_item"));
			i.setNamaItem(rs.getString("nama_item"));
			i.setColumn(rs.getString("Column"));
			
			item.add(i);
		}
		return item;
	}
	
	
}
