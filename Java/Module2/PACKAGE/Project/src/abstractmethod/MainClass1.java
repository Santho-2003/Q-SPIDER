package abstractmethod;
public class MainClass1 
{
public static void main(String[] args) 
{
	System.out.println("Version 1");
	System.out.println("-----------");
	AmazonV1.login();
	AmazonV1.shop();
	AmazonV1.prime();
	AmazonV1.logout();
	System.out.println("Version 2");
	System.out.println("------------");
	AmazonV2 v2=new AmazonV2();
	AmazonV1.login();
	AmazonV1.shop();
	AmazonV1.prime();
	AmazonV1.logout();
	v2.paybills();
}
}
