package project.simbad.dao;

import java.sql.SQLException;
import java.util.List;

import project.simbad.model.Item;

public interface ItemDAO {
	public Item saveOrUpdate(Item item, boolean isUpdate) throws SQLException;
	public Item delete(Item item) throws SQLException;
	public Item getById(String idItem) throws SQLException;
	public List<Item> getAll() throws SQLException;
}
