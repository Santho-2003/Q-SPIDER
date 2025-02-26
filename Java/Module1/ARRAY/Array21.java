class Array21
{
	public static void main(String[] args)
	{
		char X='a';
		int Y=1;
		for(int i=1; i<=5; i++)
		{
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