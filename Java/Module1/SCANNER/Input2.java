import java.util.Scanner;
class Input2
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scn.nextInt();
		for(int i=1; i<=value; i++)
		{
		   if(i%2==0)
		   {
			  System.out.println(i); 
		   }
			
		}	
	}
}