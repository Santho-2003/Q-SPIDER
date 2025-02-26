import java.util.Scanner;
class Input11
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the char value");
		char ch=scn.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("THE GIVEN STRING IS UPPER CASE");
		}
        else
		{
			System.out.println("THE GIVEN STRING IS NOT UPPER CASE");
		}			
	}
}