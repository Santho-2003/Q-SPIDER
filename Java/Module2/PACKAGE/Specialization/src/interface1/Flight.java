package interface1;

public class Flight implements Travel
{
	@Override
	public void time() 
	{
		System.out.println("Flight timing is 45 mins");
	}

}
