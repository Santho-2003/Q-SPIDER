import java.util.Scanner;
class Input12
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the char value");
		char ch=scn.next().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			System.out.println("THE GIVEN STRING IS LOWER CASE");
		}
        else
		{
			System.out.println("THE GIVEN STRING IS NOT LOWER CASE");
		}			
	}
}