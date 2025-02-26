import java.util.Scanner;
class EvenDigit
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n values");
		int n=scn.nextInt();
		display(n);
	}
	public static void display(int n)
	{
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			if(%2)
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}