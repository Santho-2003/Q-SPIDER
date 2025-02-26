import java.util.Scanner;
class Input4
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		for(int i=n; i>=1; i--)
		{
		   if(i%2!=0)
		   {
			  System.out.println(i); 
		   }		
		}	
	}
}