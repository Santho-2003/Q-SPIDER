class Array22
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			int X=1;
		    char Y='a';
			for(int j=1; j<=5; j++)
			{
				if(i%2==0)
				{
					System.out.print(Y+"\t");
		            Y++;
				}
				else
				{
					System.out.print(X+"\t");
				    X++;
				}	
			}    
			System.out.println();
		}	
	}
}	