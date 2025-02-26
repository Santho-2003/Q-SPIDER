package interface1;
import java.util.Scanner;
public class MainClass 
{
public static void main(String[] args) 
 {
	Scanner scn=new Scanner(System.in);
	System.out.println("1.Chrome\n2.Firefox\n3.Safari");
	System.out.println("Enter the choice");
	int choice=scn.nextInt();
	switch(choice)
	{
	      case 1:Chrome c1=new Chrome();
	      c1.open();
	      c1.close();
	      break;
	      case 2:Firefox f1=new Firefox();
	      f1.open();
	      f1.close();
	      break;
	      case 3:Safari s1=new Safari();
	      s1.open();
	      s1.close();
	      break;
	      default:System.out.println("Invalid choice");
	}
 }
}
