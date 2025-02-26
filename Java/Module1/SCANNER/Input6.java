import java.util.Scanner;
class Input6
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		int Count=0;
		for(int i=1; i<=n; i++)
		{  
	       if(i%2!=0)
		   {
			   Count++;
		   }		   
		}System.out.println(Count);	
	}
}