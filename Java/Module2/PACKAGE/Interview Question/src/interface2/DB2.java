package interface2;

public class DB2 implements Database
{
    @Override
	public void connect() 
    {
		System.out.println("DB2 Database is connected");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("DB2 Database is disconnected");
	}

}
