import java.util.Scanner;
class Array5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn.nextInt();
		//1.Create array
		char[] ch1=new char[size];
		//2.Insert the array values
		System.out.println("Enter the array values");
		for(int i=0; i<=ch1.length-1; i++)
		{
			ch1[i]=scn.next().charAt(0);
		}
		//3.Do operation
		System.out.println("--Result--");
		for(int i=0; i<=ch1.length-1; i++)
		{
			if(ch1[i]>='A'&&ch1[i]<='Z')
			{
				System.out.println(ch1[i]);
			}
		}	
	}
}