package interview;
public class MinMax 
{
public static void main(String[] args)
{
	int[] a1= {10,2,4,60,114,39};
	int max=a1[0];
	int min=a1[0];
	for(int i=0;i<=a1.length-1;i++) 
	{
	if(a1[i]>max)
	{
		max=a1[i];
	}
	else if(a1[i]<min) {
		min=a1[i];
	}
	}
	System.out.println(min);
	System.out.println(max);
}
}
