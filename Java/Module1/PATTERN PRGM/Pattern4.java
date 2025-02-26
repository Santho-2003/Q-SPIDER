class Pattern4
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			char X='e';
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print(X+"\t");
			       
				}	
			}
			System.out.println();
		}
	}
}