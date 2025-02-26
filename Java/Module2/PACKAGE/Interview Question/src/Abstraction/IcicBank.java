package Abstraction;
public class IcicBank implements bank
{
	@Override
	public void amount() 
	{
		System.out.println("ICIC Bank will offer loan or amount 10L");
	}
	@Override
	public void roi() 
	{
		System.out.println("ICIC Bank roi is 14.5%");
	}
	@Override
	public void tenure() 
	{
		System.out.println("ICIC Bank tenure is 10 years");
	}
}


	