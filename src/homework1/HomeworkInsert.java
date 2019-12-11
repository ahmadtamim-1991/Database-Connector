package homework1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import homework.ConnectorHelper;

public class HomeworkInsert {
	public static void main(String[]args) throws Exception{
	
	Connection con =ConnectorHelper.getconnection();
	Statement stmt =(Statement) con.createStatement();
	
	//String sql="select * from doctor where last_name ='ahmad'";
	//ResultSet rs = stmt.executeQuery(sql);
	
	String insertsql = "insert into doctor (name,gender,department,cabinet,shift)values('ahmad','M',33,12,'second')";
    stmt.executeUpdate(insertsql);
	stmt.close();
	con.close();
}
}
