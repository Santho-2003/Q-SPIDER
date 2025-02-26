package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ReadRecord_Cname 
{
public static void main(String[] args) 
{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/ADD_m7?user=root&password=root";
		Connection c=DriverManager.getConnection(dburl);
		String query="SELECT F_NAME , L_NAME FROM CUSTOMER ";//issue the query
		Statement stmt = c.createStatement();//create Statement
		ResultSet rs = stmt.executeQuery(query);//execute query & return specific two records
	    System.out.println("-----------------------------------------------");
	    System.out.println("F_name\t L_name");
	    System.out.println("-------------------------------------------------");	    
	while(rs.next())
	{
		String fname=rs.getString(1);
		String lname=rs.getString(2);
		System.out.println(fname+"\t"+lname);		
	}
	System.out.println("----------------------------------------------");
	c.close();
	stmt.close();
}
catch(ClassNotFoundException| SQLException e) 
{
	e.printStackTrace();
}
}
}
