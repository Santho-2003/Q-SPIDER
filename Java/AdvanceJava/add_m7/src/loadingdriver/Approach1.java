package loadingdriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Approach1
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbur1 ="jdbc:mysql://localhost:3306/ADD_M7?user=root&password=root";
			Connection connection = DriverManager.getConnection(dbur1);
			if (connection != null) 
			{
				System.out.println("connection established");
			} else 
			{
				System.out.println("connection failed");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
