import java.util.Scanner;
class Input9
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length value");
		double length=scn.nextDouble();
		System.out.println("Enter the breadth value");
		double breadth=scn.nextDouble();
		double area=length*breadth;
		System.out.println("Area="+area);		
	}
}