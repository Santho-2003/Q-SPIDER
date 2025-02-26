package Abstraction;

public class IndianBank implements bank
{
	@Override
	public void amount() 
	{
		System.out.println("Indian Bank will offer loan or amount 10L");
	}
	@Override
	public void roi() 
	{
		System.out.println("Indian Bank roi is 14.5%");
	}
	@Override
	public void tenure() 
	{
		System.out.println("Indian Bank tenure is 5 years");
	}
}

