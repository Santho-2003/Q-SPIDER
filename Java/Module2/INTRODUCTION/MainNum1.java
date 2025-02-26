import java.util.Scanner;
class Num1
{
  public static void display(int n)
  {
	  for(int i=n; i>=1; i--)
	  {
		  if(i%2==0)
		  {
			  System.out.println(i);
		  }
	  }
  }
}
class MainNum1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		Num1.display(n);
	}
}