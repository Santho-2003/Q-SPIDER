import java.util.Scanner;
class Factor1
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}i++;
		}
		
	}
		
}