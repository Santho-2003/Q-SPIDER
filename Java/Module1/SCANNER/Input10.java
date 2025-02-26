import java.util.Scanner;
class Input10
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius value");
		double radius=scn.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("Area="+area);		
	}
}