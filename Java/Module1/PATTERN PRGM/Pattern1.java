class Pattern1
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<=5; i++)
		{
			int X=1;
			for(int j=1; j<=i; j++)
			{
				if(j==1||i==j||i==5)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.println(X+"\t");
					X++;
				}	
			}System.out.println();
		}
	}
}