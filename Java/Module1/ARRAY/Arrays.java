import java.util.Scanner;
class Arrays
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scn.nextInt();
		int[] a1={10,20,30,40,45};
		for(int i=0;i<=a1.length-1;i++)
		{
			if(value=a1[i])
			{
				System.out.println("the given value fount at"+i);
			}
		}
	}
}