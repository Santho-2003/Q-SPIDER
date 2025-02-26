package Abstraction;
public class HDFCBank implements bank
{
	@Override
	public void amount() 
	{
		System.out.println("HDFC Bank will offer loan or amount 15L");
	}
	@Override
	public void roi() 
	{
		System.out.println("HDFC Bank roi is 13.5%");
	}
	@Override
	public void tenure() 
	{
		System.out.println("HDFC Bank tenure is 5 years");
	}
}
