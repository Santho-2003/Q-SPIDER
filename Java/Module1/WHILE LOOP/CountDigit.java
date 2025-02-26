class CountDigit
{
	public static void main(String[] args)
	{
		int num=1553321;
		int rem=0;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}