class Array14
{
	public static void main(String[] args)
	{
		int[] a1={10,20,30,40,50};
		int max=a1[0];
		for(int i=0; i<=a1.length-1; i++)
		{
			if(a1[i]>max)
			{
				max=a1[i];
			}
		}
		System.out.println(max);
	}
}