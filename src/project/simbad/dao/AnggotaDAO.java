package project.simbad.dao;

import java.sql.SQLException;
import java.util.Collection;

import project.simbad.model.Anggota;


public interface AnggotaDAO {

	public Anggota seveOrUpdate(Anggota anggota) throws SQLException;

	public Anggota delete(Anggota anggota) throws SQLException;

	public Anggota getById(Anggota anggota) throws SQLException;

	public Collection<Anggota> getAll() throws SQLException;

}
