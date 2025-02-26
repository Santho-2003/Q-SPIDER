package programs;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Read_Information 
{
public static void main(String[] args) throws IOException
{
	File file=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\demo.txt");
	FileReader fr=new FileReader(file);
    fr.read();
    System.out.println(fr.read());
    
    Scanner scn=new Scanner(file);
    while(scn.hasNext())
    {
    	System.out.println(scn.nextLine());
    }
	
	
	
}
}

//pattern programs
//array without using inbuild method Insertion()
//prime no
//Synchronization
//palindrome without using isequals method
//digit by digit using even number in ascending order
//


