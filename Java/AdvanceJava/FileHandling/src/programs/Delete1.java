package programs;
import java.io.File;
public class Delete1 
{
public static void main(String[] args) 
{
	File f1=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.txt");
    System.out.println("Way2");
	if(f1.delete()) 
	{
		System.out.println("File Deleted");
	}
	else 
	{
		System.out.println("try again!!");
	}
}
}
