package Abstraction;

public class IdfcBank implements bank
{
	@Override
	public void amount() 
	{
		System.out.println("IDFC Bank will offer loan or amount 12L");
	}
	@Override
	public void roi() 
	{
		System.out.println("IDFC Bank roi is 12.5%");
	}
	@Override
	public void tenure() 
	{
		System.out.println("IDFC Bank tenure is 2 years");
	}
}
