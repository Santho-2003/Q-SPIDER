package interface1;

public class Safari implements Browser
{
	@Override
	public void open() 
	{
		System.out.println("Safari browser is opening");
	}
	@Override
	public void close() 
	{
		System.out.println("Safari Browser is closing");
	}

}
