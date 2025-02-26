import java.util.Scanner;
class Task7
{
	public void print(int radius)
	{
	double area=3.14*radius*radius;
	System.out.println("area="+area);
	}
}
class MainOfTask7
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius=scn.nextInt();
		Task7 t7=new Task7();
		t7.print(radius);
	}
}