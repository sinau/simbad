package project.simbad.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.SQLError;

import project.simbad.dao.RegistrasiDAO;
import project.simbad.dao.RegistrasiDAOImpl;
import project.simbad.model.Registrasi;

public class RegistrasiService {
	
	private RegistrasiDAO registrasiDao;
	private Connection connection;
	
	public void setDataSource(DataSource dataSource){
		try {
			connection = dataSource.getConnection();
			registrasiDao = new RegistrasiDAOImpl();
			((RegistrasiDAOImpl) registrasiDao).setConnection(connection);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public Registrasi saveOrUpdate(Registrasi registrasi, boolean isUpdate){
		try{
			connection.setAutoCommit(false);
			registrasiDao.saveOrUpdate(registrasi, isUpdate);
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException ex){
			try{
				connection.rollback();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return registrasi;
	}
	
	public Registrasi delete(Registrasi registrasi){
		try{
			connection.setAutoCommit(false);
			registrasiDao.delete(registrasi);
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException ex){
			try{
				connection.rollback();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return registrasi;
	}
	
	public Registrasi getPerson(String idRegistrasi){
		Registrasi registrasi = null;
		try{
			registrasi = registrasiDao.getById(idRegistrasi);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return registrasi;
	}
	
	public List<Registrasi> getPersons(){
		try{
			return registrasiDao.getAll();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return new ArrayList<Registrasi>();
	}
		
	
}