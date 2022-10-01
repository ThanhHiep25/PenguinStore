package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	private static ConnectDB instance =  new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public static Connection getConnection() {
		Connection con = null;		
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLiLuong";//
			String user = "pc";// user = "sa"
			String pass = "123456";// pass = "sapassword"
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection(Connection con) {
		try {
			if (con!=null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
}
