import java.util.Scanner;
class Task6
{
	public void print(int side)
	{
	int area=side*side;
	System.out.println("area="+area);
	}
}
class MainOfTask6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the side");
		int side=scn.nextInt();
		Task6 t6=new Task6();
		t6.print(side);
	}
}