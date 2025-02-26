class Array18
{
	public static void main(String[] args)
	{
		char X='@';
		char Y='$';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i%2==0)
			    {
				System.out.print(X+"\t");
			    }
			    else
                {
				System.out.print(Y+"\t");	
			    }
			}
			System.out.println();
		}
	}
}	