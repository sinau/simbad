package project.simbad.dao;

import java.sql.SQLException;
import java.util.List;

import project.simbad.model.Anggota;

public interface AnggotaDao {
	public Anggota saveOrUpdate(Anggota anggota) throws SQLException;
	public Anggota delete(Anggota anggota) throws SQLException;
	public Anggota getById(String id) throws SQLException;
	public List<Anggota> getAll(String id) throws SQLException;
}
