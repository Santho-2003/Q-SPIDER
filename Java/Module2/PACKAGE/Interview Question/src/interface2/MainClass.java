package interface2;
import java.util.Scanner;
public class MainClass 
{
   public static void main(String[] args) 
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("1.Oracle\n2.MySQL\n3.MsSQL\n4.DB2");
	   System.out.println("Enter the choice");
	   int choice=scn.nextInt();
	   switch(choice)
	   {
	   case 1:Oracle o1=new Oracle();
	   o1.connect();
	   o1.disconnect();
	   break;
	   
	   case 2:MySQL m1=new MySQL();
	   m1.connect();
	   m1.disconnect();
	   break;
	   
	   case 3:MsSQL m2=new MsSQL();
	   m2.connect();
	   m2.disconnect();
	   break;
	   
	   case 4:DB2 d1=new DB2();
	   d1.connect();
	   d1.disconnect();
	   break;
	   
	   
	   default:System.out.println("Invalid Choice");
	   }
	   
	   
   }
	
}
