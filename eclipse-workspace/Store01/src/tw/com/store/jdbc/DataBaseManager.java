/*
* Hannah Chen &copy 
*/
package tw.com.store.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* Project:tw.com.store.jdbcStore01
* Time: Jan 11, 201911:41:35 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class DataBaseManager {
	
	public final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=store;integratedSecurity=true;";
	
	private static DataBaseManager driver = new DataBaseManager();
	
	public static DataBaseManager getInstance() {
		return driver;
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("驅動成功");
			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("DB連線成功");
			if(!conn.isClosed()) {
                System.out.println("資料庫連接已開啟…");
            }
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驅動程式類別");
			
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void close(Connection con) throws SQLException {
		if(con!=null) {
			con.close();
		}
	}
	
	public void close(Statement st) throws SQLException {
		if(st!=null) {
			st.close();
		}
	}
	
	public void close(PreparedStatement ps) throws SQLException {
		if(ps!=null) {
			ps.close();
		}
	}
	
	public void close(ResultSet rs) throws SQLException {
		if(rs!=null) {
			rs.close();
		}
	}
}
