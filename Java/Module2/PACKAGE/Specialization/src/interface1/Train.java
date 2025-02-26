package interface1;

public class Train implements Travel
{
	@Override
	public void time() 
	{
		System.out.println("Train timing is 2.5 hrs");
	}

}
