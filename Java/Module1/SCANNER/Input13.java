import java.util.Scanner;
class Input13
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the char value");
		char ch=scn.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("THE GIVEN STRING IS VOWELES");
		}
        else
		{
			System.out.println("THE GIVEN STRING IS CONSONANTS");
		}			
	}
}