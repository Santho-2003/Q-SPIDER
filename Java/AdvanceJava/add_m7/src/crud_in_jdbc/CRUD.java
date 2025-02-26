package crud_in_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD 
{
public static void main(String[] args)
{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/add_m7?user=root&password=root";
		Connection c= DriverManager.getConnection(dburl);
		String query1="INSERT INTO CUSTOMER VALUES(14,'KAVIN','n',20,'Brazil')";
		String query2="INSERT INTO CUSTOMER VALUES(15,'DHONi','n',22,'Button')";
		String query3="INSERT INTO CUSTOMER VALUES(16,'VISVA','n',25,'Button')";
		String query4="INSERT INTO CUSTOMER VALUES(17,'MUSH','n',20,'Brazil')";
		Statement stmt=c.createStatement();
		//add all the query into batch container/group
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		stmt.addBatch(query4);
		int[] arr = stmt.executeBatch();//execute query-> returns multiple query affected
		for(int count:arr)//process the query
		{
			System.out.println("Insertion|Updation|Deletion done succesffully"+count);
		}
		ResultSet rs=stmt.executeQuery("SELECT * FROM CUSTOMER");//execute query and returns entire table record
		System.out.println("-------------------------------------------------------");
		System.out.println("id\tF_name\tL_name\tage\tcountry");
		System.out.println("-------------------------------------------------------");
		while(rs.next()) //process the query
		{
			int id=rs.getInt(1);
			String f_name=rs.getString(2);
			String l_name=rs.getString(3);
			int age=rs.getInt(4);
			String country=rs.getString(5);
			System.out.println(id+"\t"+f_name+"\t\t"+l_name+"\t\t"+age+"\t\t"+country);
		}
		System.out.println("---------------------------------------------------------");
		c.close();
		stmt.close();
	}	
	catch(ClassNotFoundException|SQLException e)
	{
		e.printStackTrace();
	}

}
}
