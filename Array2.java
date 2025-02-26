import java.util.Scanner;
class Array2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn.nextInt();
		//1.Create array
		int[] a1=new int[size];
		//2.Insert the array values
		System.out.println("Enter the array values");
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scn.nextInt();
		}
		//3.Do operation
		int Sum=0;
		System.out.println("--Result--");
		for(int i=0; i<=a1.length-1; i++)
		{
			if(a1[i]%2!=0)
			{
				Sum=Sum+a1[i];
			}
		}
		System.out.println(Sum);
	}
}