import java.util.Scanner;
class AmazonPayment
{
	public void payment()
	{
		System.out.println("Payment Done");
	}
	public void payment(String upi)
	{
		System.out.println("Payment Done via upi");
	}
	public void payment(long cardno,int cvv)
	{
		System.out.println("Payment Done via cardno");
	}
	public void payment(String username,String password)
	{
		System.out.println("Payment Done via Internet Banking");
	}
}
class MainOfAmazon
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		AmazonPayment a1=new AmazonPayment();
		System.out.println("1.payment\n2.payment via upi\n3.payment via cardno\n4.payment via username");
		System.out.println("Please enter the choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1:System.out.println("Enter payment");
			       int payment=scn.nextInt();
				   a1.payment();
				   break;
			case 2:System.out.println("Enter upi");
                   String upi=scn.next();
				   a1.payment( upi);
				   break;
			case 3:System.out.println("Enter cardno");
                   long cardno=scn.nextLong();
				   System.out.println("Enter cvv");
				   int cvv=scn.nextInt();
				   a1.payment( cardno, cvv);
				   break;
			case 4:System.out.println("Enter username");
                   String username=scn.next();
				   System.out.println("Enter password");
				   String password=scn.next();
				   a1.payment( username, password);
				   break;
			default:System.out.println("Invalid Choice");	   
				   
		}
		
	}
}