package project.simbad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.simbad.model.*;

public class RegistrasiDAOImpl implements RegistrasiDAO {
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getAllStatement;
	
	private final String INSERT_QUERY = "insert into registrasi(id_rs,nama,alamat,asal_sekolah,no_tlpn,tgl_pembuatan,tgl_update)values(?,?,?,?,?,?,?)";
	private final String UPDATE_QUERY = "update registrasi set nama=?, alamat=?, asal_sekolah=?,no_tlpn=?,tgl_pembuatan=?,tgl_update where id_rs=?";
	private final String DELETE_QUERY = "delete from registrasi where id_rs=?";
	private final String GET_BY_ID_QUERY = "select id_rs,nama,alamat,asal_sekolah,no_tlpn,tgl_pembuatan,tgl_update from registrasi where id_rs=?";
	private final String GET_ALL_QUERY = "select id_rs,nama,alamat,asal_sekolah,no_tlpn,tgl_pembuatan,tgl_update from registrasi";
	
	public void setConnection(Connection connection) throws SQLException{
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		updateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement = this.connection.prepareStatement(DELETE_QUERY);
		getByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
		
	}

	@Override
	public Registrasi saveOrUpdate(Registrasi registrasi, boolean isUpdate)throws SQLException {
		if(!isUpdate){
			insertStatement.setString(1, registrasi.getIdRegistrasi());
			insertStatement.setString(2, registrasi.getNama());
			insertStatement.setString(3, registrasi.getAlamat());
			insertStatement.setString(4, registrasi.getAsalSekolah());
			insertStatement.setString(5, registrasi.getNoTelepon());
			insertStatement.setString(6, registrasi.getTanggalPembuatan());
			insertStatement.setString(7, registrasi.getTanggalUpdate());
			insertStatement.executeUpdate();
		}
		else {
			updateStatement.setString(1, registrasi.getNama());
			updateStatement.setString(2, registrasi.getAlamat());
			updateStatement.setString(3, registrasi.getAsalSekolah());
			updateStatement.setString(4, registrasi.getNoTelepon());
			updateStatement.setString(5, registrasi.getTanggalPembuatan());
			updateStatement.setString(6, registrasi.getTanggalUpdate());
			updateStatement.executeUpdate();
		}
		return registrasi;
	}

	@Override
	public Registrasi delete(Registrasi registrasi) throws SQLException {
		deleteStatement.setString(1, registrasi.getIdRegistrasi());
		deleteStatement.executeUpdate();
		return registrasi;
	}

	@Override
	public Registrasi getById(String idRegistrasi) throws SQLException {
		getByIdStatement.setString(1, idRegistrasi);
		ResultSet rs = getByIdStatement.executeQuery();
		
		if(rs.next()){
			Registrasi registrasi = new Registrasi();
			registrasi.setIdRegistrasi(rs.getString("id_rs"));
			registrasi.setNama(rs.getString("nama"));
			registrasi.setAlamat(rs.getString("alamat"));
			registrasi.setAsalSekolah(rs.getString("asal_sekolah"));
			registrasi.setNoTelepon(rs.getString("no_tlpn"));
			registrasi.setTanggalPembuatan(rs.getString("tgl_pembuatan"));
			registrasi.setTanggalUpdate(rs.getString("tgl_update"));
			
			return registrasi;
		}
		return null;
	}

	@Override
	public List<Registrasi> getAll() throws SQLException {
		List<Registrasi> registrasi = new ArrayList<Registrasi>();
		ResultSet rs = getAllStatement.executeQuery();
		while(rs.next()){
			Registrasi r = new Registrasi();
			r.setIdRegistrasi(rs.getString("id_rs"));
			r.setNama(rs.getString("nama"));
			r.setAlamat(rs.getString("alamat"));
			r.setAsalSekolah(rs.getString("asal_sekolah"));
			r.setNoTelepon(rs.getString("no_tlpn"));
			r.setTanggalPembuatan(rs.getString("tgl_pembuatan"));
			r.setTanggalUpdate(rs.getString("tgl_update"));
			
			registrasi.add(r);
		}	
		return registrasi;
	}
}
