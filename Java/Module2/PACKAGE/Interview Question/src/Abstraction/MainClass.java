package Abstraction;
import java.util.Scanner;
public class MainClass 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	BankFactory bf=new BankFactory();
	System.out.println("1.HDFC BANK\n2.INDIAN BANK\n3.ICIC BANK\n4.IDFC BANK");
	System.out.println("Enter the choice");
	int choice=scn.nextInt();
	switch(choice)
	{
	case 1:bf.get(new HDFCBank());
	break;
	
	case 2:bf.get(new IndianBank());
	break;
	
	case 3:bf.get(new IcicBank());
	break;
	
	case 4:bf.get(new IdfcBank());
	break;

	default: System.out.println("Invalid Choice");
	}
}
}
