package project.simbad.dao;

import java.sql.SQLException;
import java.util.List;

import project.simbad.model.Inventaris;
public interface inventarisDAO {
	public inventaris saveOrUpdate(inventaris inventaris) throws SQLException;
	public inventaris delete(inventaris inventaris) throws SQLException;
	public inventaris getById(String nim) throws SQLException;
	public List<inventaris> getAll() throws SQLException;
	

}
