package jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadRecord1 
{
public static void main(String[] args) 
{
	Scanner scn= new Scanner(System.in);
	System.out.println("enter customer id:");
	int id=scn.nextInt();
	try 
	{
		Class.forName("com.mysql.jdbc.cj.Driver");//Loading Driver
		String dburl="jdbc:mysql://localhost:3306/add_m7?user=root&password=root";
		Connection c=DriverManager.getConnection(dburl);//establish connection
	    String query="SELECT * FROM CUSTOMER WHERE ID=1";//issue the query
	    PreparedStatement psmt=c.prepareStatement(query);//create statement
	    //Set the values for given place holders 
	    psmt.setInt(1, id);
	    ResultSet rs =psmt.executeQuery();//execute query & return specific records
	    System.out.println("----------------------------------------------------");
	    System.out.println("id \t E-name \t Age \t Country");
	    System.out.println("----------------------------------------------------");
	    if(rs.next())//process the query
	    {
	    	int id1=rs.getInt(1);
	    	String fname=rs.getString(2);
	    	String lname=rs.getString(3);
	    	int age=rs.getInt(4);
	    	String country=rs.getString(5);
	    	System.out.println(id+"\t"+fname+"\t\t"+lname+"\t\t"+age+"\t\t"+country);
	    }
	    else 
	    {
	    	System.out.println("Given customer id is invalid"+id);
	    }
	    System.out.println("--------------------------------------------");
	    c.close();//close connection
	    psmt.close();
	}
	catch(ClassNotFoundException| SQLException e) 
	{
		e.printStackTrace();
	}
}
}
