package interface2;
public class Oracle implements Database
{
	@Override
	public void connect() 
	{
		System.out.println("Oracle Database is connected");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("Oracle Database in disconnected");
	}

}
