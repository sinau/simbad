package project.simbad.dao;

import java.sql.SQLException;
import java.util.List;

import project.simbad.model.RegistrasiItem;

public interface RegistrasiItemDAO {
	public RegistrasiItem saveOrUpdate(RegistrasiItem registrasiItem,
			boolean isUpdate) throws SQLException;

	public RegistrasiItem delete(RegistrasiItem registrasiItem)
			throws SQLException;

	public RegistrasiItem getById(String idRegistrasi) throws SQLException;

	public List<RegistrasiItem> getAll() throws SQLException;
}
