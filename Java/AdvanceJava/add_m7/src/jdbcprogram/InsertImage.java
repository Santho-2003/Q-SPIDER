package jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.IOException;
public class InsertImage 
{
public static void main(String[] args) 
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/ADD_m7?user=root&password=root";
		Connection c=DriverManager.getConnection(dburl);
		String query="INSERT INTO ACTOR(idactor,a_name,a_lang,a_image) VALUES(?,?,?,?)";
		PreparedStatement psmt=c.prepareStatement(query);
		//Set the values for place holders
		psmt.setInt(1, 1);
		psmt.setString(2, "nature");
		psmt.setString(3, "Tamil");
		FileInputStream file= new FileInputStream("F:\\abstract-musical-note-symbol-painting-black-background-generative-ai-photo.jpg");
		psmt.setBinaryStream(4, file);
		int count=psmt.executeUpdate();
		if(count>0)
		{
			System.out.println("Insertion Done");
		}
		else 
		{
			System.out.println("Insertion Not Done Pls Try again");
		}
		c.close();
		psmt.close();	
	}
	catch(ClassNotFoundException| SQLException| IOException e) 
	{
		e.printStackTrace();
	}
}
}
