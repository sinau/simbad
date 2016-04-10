package project.simbad.dao;

import java.sql.SQLException;
import java.util.List;

import project.simbad.model.Inventaris;
public interface InventarisDAO {
	public Inventaris saveOrUpdate(Inventaris inventaris, boolean isUpdate) throws SQLException;
	public Inventaris delete(Inventaris inventaris) throws SQLException;
	public Inventaris getById(String nim) throws SQLException;
	public List<Inventaris> getAll() throws SQLException;
	

}
