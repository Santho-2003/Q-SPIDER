package jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;
public class InsertRecord 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the customer id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the customer first name");
	String f_name=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the customer last name");
	String l_name=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the country");
	String country=sc.nextLine();
	sc.nextLine();
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//Loading Driver
		String dburl="jdbc:mysql://localhost:3306/add_m7?user=root&password=root";
		Connection c=DriverManager.getConnection(dburl);//establish connection
	    String query="INSERT INTO CUSTOMER(id,f_name,l_name,age,country)VALUES(?,?,?,?,?)";//issue the query
	    PreparedStatement psmt=c.prepareStatement(query);//create statement
		psmt.setInt(1, id);
	    psmt.setString(2, f_name);
	    psmt.setString(3, l_name);
	    psmt.setInt(4, age);
	    psmt.setString(5, country);
	    int count=psmt.executeUpdate();//execute query
	    if(count>0)
	    {
	    	System.out.println("Data inserted");
	    }
	    else 
	    {
	    	System.out.println("Data not inserted try again");
	    }
	    c.close();//close
	    psmt.close();
    }
	catch(ClassNotFoundException |SQLException e)
	{
		e.printStackTrace();
	}

}
}