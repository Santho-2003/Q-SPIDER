import java.util.Scanner;
class TrainSearch
{
	public void search(int TrainNo)
	{
		System.out.println("Train Searched via TrainNo");
	}
	public void search(String TrainName)
	{
		System.out.println("Train Searching done successful via TrainName");
	}
}
class MainOfTrain
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
	    TrainSearch t1=new TrainSearch();
	    System.out.println("1.login via TrainNo\n2.login via TrainName");
	    System.out.println("please make a choice");
	    int choice=scn.nextInt();
	    switch(choice)
	    {
		   case 1:System.out.println("Enter TrainNo");
		   int TrainNo=scn.nextInt();
		   t1.search(TrainNo);
		   break;
		   case 2:System.out.println("Enter TrainName");
		   String TrainName=scn.next();
		   t1.search(TrainName);
		   break;
		   default:System.out.println("Invalid Choice");
	    }
	}	
}