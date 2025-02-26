package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class MainOfDeserialization 
{
public static void main(String[] args) 
{
	try 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.txt");
	    ObjectInputStream o=new ObjectInputStream(f);
	    Student s=(Student)o.readObject();
	    System.out.println(s.name+" "+s.age+" "+s.roll);
	}
	catch(IOException|ClassNotFoundException io)
	{
		io.printStackTrace();
	} 
}
}
