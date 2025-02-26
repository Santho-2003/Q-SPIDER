import java.util.Scanner;
class Array9
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn.nextInt();
		//1.Create array
		double[] d1=new double[size];
		//2.Insert the array values
		System.out.println("Enter the array values");
		for(int i=0; i<=d1.length-1; i++)
		{
			d1[i]=scn.nextDouble();
		}
		//3.Do operation
		System.out.println("--Result--");
		for(int i=d1.length-1; i>=0; i--)
		{
			if(d1[i]>20.2)
			{
				 System.out.println(d1[i]);
			}
		}	
	}
}