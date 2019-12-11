package homework;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorHelper {
	
	public static Connection getconnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsdb", "root",
				"root");
		return con;
	}

}
