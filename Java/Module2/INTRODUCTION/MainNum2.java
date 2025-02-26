import java.util.Scanner;
class Num2
{
  public static void print(int n)
  {
	  int Sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  if(i%2!=0)
		  {
			  Sum=Sum+i;
		  }
	  }System.out.println(Sum);
  }
}
class MainNum2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		Num2.print(n);
	}
}