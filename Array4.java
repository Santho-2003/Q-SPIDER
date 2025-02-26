import java.util.Scanner;
class Array4
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
		double Sum=0.0;
		System.out.println("--Result--");
		for(int i=0; i<=d1.length-1; i++)
		{
			if(d1[i]>10.1&&d1[i]<20.2)
			{
				Sum=Sum+d1[i];
			}
		}
		System.out.println(Sum);
	}
}