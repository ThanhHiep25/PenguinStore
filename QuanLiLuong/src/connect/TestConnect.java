package connect;

import java.sql.Connection;

public class TestConnect {

	public static void main(String[] args) {
		Connection con = ConnectDB.getConnection();
		System.out.println(con);
	}

}
