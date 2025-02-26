class InstagramV1
{
	public void login()
	{
		System.out.println("Login Done");
	}
	public void reels()
	{
		System.out.println("30 secs reels uploaded");
	}
	public void sharepost()
	{
		System.out.println("Share post via Instagram");
	}
	public void message()
	{
		System.out.println("Message sent/received");
	}
	public void like()
	{
		System.out.println("Like done");
	}
	public void logout()
	{
		System.out.println("Logout done");
	}
}
class InstagramV2 extends InstagramV1
{
	@Override
	public void reels()
	{
		System.out.println("90 secs reels uploaded");
	}
	@Override
	public void sharepost()
	{
		System.out.println("Share post via Instagram/whatsapp/gmail/twitter..");
	}
}
class MainOfInstagram
{
	public static void main(String[] args)
	{
		System.out.println("Version 1 features are");
		System.out.println("-----------------------");
		InstagramV1 i1=new InstagramV1();
		i1.login();
		i1.reels();
		i1.sharepost();
		i1.message();
		i1.like();
		i1.logout();
		System.out.println("-----------------------");
		System.out.println("Version 2 features are");
		System.out.println("-----------------------");
		InstagramV2 i2=new InstagramV2();
		i2.login();
		i2.reels();
		i2.sharepost();
		i2.message();
		i2.like();
		i2.logout();
	}
}