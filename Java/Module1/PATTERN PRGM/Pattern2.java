class Pattern2
{
	public static void main(String[] args)
	{
		char X='a';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(X+"\t");
			    X++;	
			}
			System.out.println();
		}
	}
}