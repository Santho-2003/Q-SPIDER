class Pattern9
{
	public static void main(String[] args)
	{
		int a=1;
		for(int i=1; i<=5; i++)
		{	
	   
			for(int j=1; j<=i; j++)
			{
				if(i==(5-1)/2||j==(5-1)/2)
				{
					System.out.print(a+"\t");
					
				}
				else
				{
					System.out.print(" \t");
					    
				}	
			}
			System.out.println();
		}
	}
}