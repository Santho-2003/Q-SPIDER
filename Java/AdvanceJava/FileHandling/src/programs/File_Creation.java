package programs;
import java.io.File;
import java.io.IOException;
public class File_Creation 
{
public static void main(String[] args) throws IOException 
{
	File file=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\Demo.zip");
	boolean isCreated=file.createNewFile();
	if(isCreated) 
	{
		System.out.println("zip Created");
	}
	else 
	{
		System.out.println("try again!!");
	}
}
}
