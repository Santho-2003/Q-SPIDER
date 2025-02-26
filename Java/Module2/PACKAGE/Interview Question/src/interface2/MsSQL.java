package interface2;

public class MsSQL implements Database
{
	@Override
	public void connect() 
	{
		System.out.println("MsSQL Database is connected");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("MsSQL Database is disconnected");
	}
}
