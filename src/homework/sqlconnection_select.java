package homework;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class sqlconnection_select {
	public static void main(String[]args) throws Exception  {
		
		Connection con =ConnectorHelper.getconnection();
		Statement stmt =(Statement) con.createStatement();
		
		String sql="select * from patients where last_name ='ahmad'";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			Thread.sleep(500);
		long id =rs.getInt("id");
		String firstName =rs.getString("first_name");
		String middleName = rs.getString("middle_name");
		String lastName = rs.getString("last_name");
		String gender = rs.getString("gender");
		int age = rs.getInt("age");
		String Ap = rs.getString("authorized_representer");
		Date  date =rs.getDate("last_visit");
		String reasonV = rs.getString("reason_of_visit");
		int department = rs.getInt("department_visited");
		String visitedD = rs.getString("visited_doctor");
		
		
		System.out.println("id:" +id+ ", firstName:" +firstName+ ", middleName:" +middleName+ ", lastname:" +lastName+ ", gender:" +gender+ ", age:" +age+ ", authorized_rep:"+
		Ap+ ", date:" +date+ ", reason_of_visit:" +reasonV+ ", department:" +department+ ", visitedDoctor:" +visitedD);
		//stmt.close();
		//con.close();
		}
		
	}
	
}
