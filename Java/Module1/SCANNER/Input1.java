import java.util.Scanner;
class Input1
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scn.nextInt();
		for(int i=1; i<=value; i++)
		{
			System.out.println(i);
		}	
	}
}