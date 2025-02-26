import java.util.Scanner;
class Input5
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		int Sum=0;
		for(int i=1; i<=n; i++)
		{  
	       Sum=Sum+i;
		}	
		System.out.println(Sum);
	}
}