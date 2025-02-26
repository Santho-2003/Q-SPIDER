package interface1;
import java.util.Scanner;
public class MainClass 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.println("1.Bus\n2.Train\n3.Car\n4.Flight");
	System.out.println("Enter the user choice");
	int choice=scn.nextInt();
	Help h1=new Help();
	switch(choice)
	{
	case 1:h1.get(new Bus());
	break;
		
	case 2:h1.get(new Train());
	break;
		
	case 3:h1.get(new Car());
	break;
		
	case 4:h1.get(new Flight());
	break;
		
	default:System.out.println("Invalid Choice");
	}
}
}
