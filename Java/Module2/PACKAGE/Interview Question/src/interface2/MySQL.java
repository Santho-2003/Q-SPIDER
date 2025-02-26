package interface2;

public class MySQL implements Database
{
	@Override
	public void connect()
	{
		System.out.println("MySQL Database is connected");
	}

	@Override
	public void disconnect() 
	{
		System.out.println("MySQL Database is disconnected");	
	}

}
