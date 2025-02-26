import java.util.Scanner;
class Task5
{
	public void print(double length,double breadth)
	{
	double area=length*breadth;
	System.out.println("area="+area);
	}
}
class MainOfTask5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length");
		double length=scn.nextDouble();
		System.out.println("Enter the breadth");
		double breadth=scn.nextDouble();
		Task5 t5=new Task5();
		t5.print(length,breadth);
	}
}