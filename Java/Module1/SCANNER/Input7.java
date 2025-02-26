import java.util.Scanner;
class Input7
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		for(int i=1; i<=70; i++)
		{  
	       if(i%n==0)
		   {
			  System.out.println(i); 
		   }		   
		}	
	}
}