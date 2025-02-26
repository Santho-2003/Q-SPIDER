package programs;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Insert_Information 
{
public static void main(String[] args) throws IOException
{
	File file=new File("C:\\Users\\Santhoshini\\OneDrive\\Desktop\\Sample\\demo.txt");
	FileWriter fw=new FileWriter(file);
	fw.write("Hi");
	fw.append("Hello how are you, welcome to our program");
	fw.flush(); //used to save information inside the file
	System.out.println("Data inserted done succesfully");
	fw.close();
}
}
