package loadingdriver;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class Approach2 
{
public static void main(String[] args) 
{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/ADD_m7";
		String user="root";
		String password="root";
		Connection c=DriverManager.getConnection(dburl,user,password);
		if(c!=null) 
		{
			System.out.println("Connection Established");
		}
		else 
		{
			System.out.println("Connection failed");
		}
		
	}
	catch(ClassNotFoundException|SQLException e) 
	{
		e.printStackTrace();
	}
}
}
