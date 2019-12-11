package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsdb", "root",
				"root");

		Statement stmt = (Statement) con.createStatement();

		String updatesql="update patients set gender= 'F' where first_name = 'james'";
		stmt.executeUpdate(updatesql);

		stmt.close();
		con.close();

	}

}
