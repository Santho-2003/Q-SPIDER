class Whiletask8
{
	public static void main(String[] args)
	{
		int i=151;
		int sum=0;
		while(i<=251)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
            i++;			
		}
		System.out.println(sum);	
	}
}