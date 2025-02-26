class Pattern3
{
	public static void main(String[] args)
	{
		char X='A';
		int Y=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(X+"\t");
			        X++;
				}
				else
				{
					System.out.print(Y+"\t");
			        Y++;
				}	
			}
			System.out.println();
		}
	}
}