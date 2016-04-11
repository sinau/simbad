package project.simbad.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import project.simbad.model.*;

public interface RegistrasiDAO {
	public Registrasi saveOrUpdate(Registrasi registrasi, boolean isUpdate)
			throws SQLException;

	public Registrasi delete(Registrasi registrasi) throws SQLException;

	public Registrasi getById(String idRegistrasi) throws SQLException;

	public List<Registrasi> getAll() throws SQLException;
}
