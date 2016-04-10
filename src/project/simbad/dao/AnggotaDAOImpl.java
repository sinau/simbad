package project.simbad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import project.simbad.model.Anggota;


public abstract class AnggotaDAOImpl implements AnggotaDAO {

	private static final String INSERT_QUERY = null;
	private static final String UPDATE_QUERY = null;
	private static final String DELETE_QUERY = null;
	private static final String GET_BY_ID_QUERY = null;
	private static final String GET_ALL_QUERY = null;
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getByAllStatement;
	private PreparedStatement getAllStatement;

	public void setConnection(Connection connection) throws SQLException {
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		Object setUpdateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		setUpdateStatement = this.connection.prepareStatement(DELETE_QUERY);
		Object setGetByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		Object setGetAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
	}

	public Anggota seveOrUpdate(Anggota anggota, boolean isUpdate) throws SQLException {
		if (!isUpdate) {
			insertStatement.setString(1, Anggota.getId_agt());
			insertStatement.setString(2, Anggota.getNama_agt());
			insertStatement.setString(3, Anggota.getAlamat());
			insertStatement.setString(4, Anggota.getTempat_lahir());
			insertStatement.setDate(5, Anggota.getTanggal_lahir());
			insertStatement.setString(6, Anggota.getJeniskelamin());
			insertStatement.setString(7, Anggota.getAsal_sekolah());
			insertStatement.setString(8, Anggota.getNo_telpn());
			insertStatement.setString(9, Anggota.getEmail());
		}
		return anggota;
	}

	public Anggota delete(Anggota anggota) throws SQLException {
		deleteStatement.setString(1, Anggota.getId_agt());
		deleteStatement.executeUpdate();
		return anggota;

	}

	public Anggota getById(String Id_agt) throws SQLException {
		getByIdStatement.setString(1, Id_agt);
		ResultSet rs = getByIdStatement.executeQuery();

		if (rs.next()) {
			Anggota anggota = new Anggota();
			anggota.setId_agt(rs.getString("Id_agt"));
			anggota.setId_agt(rs.getString("Nama_agt"));
			anggota.setId_agt(rs.getString("Alamat"));
			anggota.setId_agt(rs.getString("Tempat_lahir"));
			anggota.setId_agt(rs.getString("Tanggal_lahir"));
			anggota.setId_agt(rs.getString("Jeniskelamin"));
			anggota.setId_agt(rs.getString("Asal_sekolah"));
			anggota.setId_agt(rs.getString("No_telpn"));
			anggota.setId_agt(rs.getString("Email"));

		}
		return null;
	}

	public Collection<Anggota> getAll() throws SQLException {
		List<Anggota> anggota = new ArrayList<Anggota>();
		ResultSet rs = getAllStatement.executeQuery();
		while (rs.next()) {
			Anggota agt = new Anggota();
			agt.setId_agt(rs.getString("Id_agt"));
			agt.setId_agt(rs.getString("Nama_agt"));
			agt.setId_agt(rs.getString("Alamat"));
			agt.setId_agt(rs.getString("Tempat_lahir"));
			agt.setId_agt(rs.getString("Tanggal_lahir"));
			agt.setId_agt(rs.getString("Jeniskelamin"));
			agt.setId_agt(rs.getString("Asal_sekolah"));
			agt.setId_agt(rs.getString("No_telpn"));
			agt.setId_agt(rs.getString("Email"));

		}
		return anggota;
	}

}
