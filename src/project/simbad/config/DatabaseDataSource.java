package project.simbad.config;

import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseDataSource {
	private MysqlDataSource mysqlDataSource;
	
	public DatabaseDataSource(){
		mysqlDataSource = new MysqlDataSource();
	}
	
	public MysqlDataSource getMysqlDataSource(){
		mysqlDataSource.setUser("root");
		mysqlDataSource.setPassword("");
		mysqlDataSource.setDatabaseName("simbad");
		mysqlDataSource.setServerName("localhost");
		mysqlDataSource.setPortNumber(3306);
				
		return mysqlDataSource;	
	}
	
	public void closeMysqlConnection(){
		try{
			mysqlDataSource.getConnection().close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
