class Pattern5
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<=5; i++)
		{
			int a=1;
		    char b='a';
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(a+"\t");
					a++;
				}
				else
				{
					System.out.print(b+"\t");
					b++;     
				}	
			}
			System.out.println();
		}
	}
}