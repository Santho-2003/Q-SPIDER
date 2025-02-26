package serialization;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class MainOfDeEmployee 
{
public static void main(String[] args) 
{
	try 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    Employee e1=(Employee)ois.readObject();
	    Employee e2=(Employee)ois.readObject();
	    System.out.println(e1.name+" "+e1.emp_id+" "+e1.cname+" "+e1.salary);
	    System.out.println(e2.name+" "+e2.emp_id+" "+e2.cname+" "+e2.salary);
	}
	catch(IOException|ClassNotFoundException io) 
	{
		io.printStackTrace();
		System.out.println("try again");
	}
}
}
