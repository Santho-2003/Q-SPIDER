package interface1;
public class Chrome implements Browser
{
	@Override
	public void open() 
	{
		System.out.println("Chrome Browser is opening");
	}

	@Override
	public void close() 
	{
		System.out.println("Chrome Browser is closing");
	}

}
