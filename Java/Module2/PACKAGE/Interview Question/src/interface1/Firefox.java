package interface1;

public class Firefox implements Browser
{
	@Override
	public void open() 
	{
		System.out.println("Firefox browser is opening");
	}

	@Override
	public void close() 
	{
		System.out.println("Firefox Browser is closing");
	}

}
