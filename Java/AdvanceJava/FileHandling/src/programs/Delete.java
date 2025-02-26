package programs;
import java.io.File;
public class Delete 
{
public static void main(String[] args) 
{
	File f1=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.zip");
	System.out.println("Delete the file");
	boolean isDeleted=f1.delete();
	if(isDeleted) 
	{
		System.out.println("File Deleted Successfully");
	}
	else 
	{
		System.out.println("try again!!");
	}
	
}
}
