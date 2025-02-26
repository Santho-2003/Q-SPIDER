import java.util.Scanner;
class Num3
{
  public static void print(int n)
  { 
	  for(int i=1;i<=n;i++)
	  {
		  if(i%4==0)
		  {
			 System.out.println(i); 
		  }
	  }
  }
}
class MainNum3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scn.nextInt();
		Num3.print(n);
	}
}