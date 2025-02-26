package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRecord_CC 
{
public static void main(String[] args) 
{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/ADD_m7?user=root&password=root";
		Connection c=DriverManager.getConnection(dburl);
		String query="SELECT * FROM CUSTOMER WHERE ID NOT IN(1,3)";//issue the query
		Statement stmt = c.createStatement();//create Statement
		ResultSet rs = stmt.executeQuery(query);//execute query & return specific two records
	    System.out.println("--------------------------------------------------------");
	    System.out.println("Id \t F_name \t L_name \t Age \t Country");
	    System.out.println("--------------------------------------------------------");	    
	while(rs.next())
	{
		int id=rs.getInt(1);
		String fname=rs.getString(2);
		String lname=rs.getString(3);
		int age=rs.getInt(4);
		String country=rs.getString(5);
		System.out.println(id+"\t"+fname+"\t\t"+lname+"\t\t"+age+"\t"+country);		
	}
	System.out.println("--------------------------------------------------------");
	c.close();
	stmt.close();
}
catch(ClassNotFoundException| SQLException e) 
{
	e.printStackTrace();
}
}
}

