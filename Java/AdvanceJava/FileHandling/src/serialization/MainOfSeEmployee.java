package serialization;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainOfSeEmployee 
{
public static void main(String[] args) 
{
	Employee e1=new Employee("Santho",32,45000.0,"Zoho");
	Employee e2=new Employee("Sheela",312,47000.0,"Wipro");
	try 
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(e1);
	    oos.writeObject(e2);
	    oos.flush();
	    System.out.println("Data Inserted");
	    oos.close();
	}
	catch(IOException io) 
	{
		io.printStackTrace();
	}
	
	
}
}
