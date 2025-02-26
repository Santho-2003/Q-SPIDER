package programs;
import java.io.File;
public class Folder_Creation 
{
public static void main(String[] args) 
{
	File file=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample");
	boolean isCreated=file.mkdir();
	if(isCreated) 
	{
		System.out.println("Folder Created");
	}
	else 
	{
		System.out.println("Tryagain");
	}
		
}
}
