class Amazon
{
	public void login()
	{
		System.out.println("Login done");
	}
	public void pay()
	{
		System.out.println("You can pay phone bill...");
	}
	public void shop()
	{
		System.out.println("You can do shopping");
	}
	public void logout()
	{
		System.out.println("Logout done");
	}
}
class AmazonA extends Amazon
{
	@Override
	public void pay()
	{
		System.out.println("You can pay phone bill/gas/water/eletricity...");
	}
	public void music()
	{
		System.out.println("You can listen music");
	}
	public void prime()
	{
		System.out.println("You can watch movies and series");
	}
}
class MainOfAmazon
{
	public static void main(String[] args)
	{
		System.out.println("Version1 features are");
		System.out.println("---------------------------");
		Amazon a=new Amazon();
		a.login();
		a.pay();
		a.shop();
		a.logout();
		System.out.println("---------------------------");
		System.out.println("Version1 features are");
		System.out.println("---------------------------");
		AmazonA a1=new AmazonA();
		a1.login();
		a1.pay();
		a1.shop();
		a1.music();
		a1.prime();
		a1.logout();
	}
}