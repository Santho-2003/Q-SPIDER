import java.util.Scanner;
class Array13
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn.nextInt();
		//1.Create array
		String[] s1=new String[size];
		//2.Insert the array values
		System.out.println("Enter the array values");
		for(int i=0; i<=s1.length-1; i++)
		{
			s1[i]=scn.next();
		}
		//3.Do operation
		System.out.println("--Result--");
		for(int i=0; i<=s1.length-1; i++)
		{
			if(s1[i].startsWith("S"))
			{
				System.out.println(s1[i]);
			}
		}
	}
}