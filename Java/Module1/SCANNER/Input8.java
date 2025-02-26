import java.util.Scanner;
class Input8
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the base value");
		double base=scn.nextDouble();
		System.out.println("Enter the height value");
		double height=scn.nextDouble();
		double area=0.5*base*height;
		System.out.println("Enter the area ="+area);		
	}
}