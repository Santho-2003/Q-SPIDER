package serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class MainOfSerialization 
{
public static void main(String[] args) 
{
	Student s=new Student("Mr.San",21,23);
	try 
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\demo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		System.out.println("data inserted");
		oos.close();
	}
	catch(IOException io)
	{
		io.printStackTrace();
	}
}
}
