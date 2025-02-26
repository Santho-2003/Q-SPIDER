package interview;
public class SecondLargSmall 
{
public static void main(String[] args) 
{
	int[] arr= {10,25,8,42,2};
	int min=arr[0]; int Secondmin=arr[0];
	int max=arr[0]; int Secondmax=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			Secondmax=max;
			max=arr[i];
		}
		else if(arr[i]>Secondmax)
		{
			Secondmax=arr[i];
		}
		 if (arr[i] < min) 
		 {
             Secondmin = min;
             min = arr[i];
         } 
		 else if (arr[i] < Secondmin)
		 {
             Secondmin = arr[i];
         }
      }
	System.out.println(Secondmin);
	System.out.println(Secondmax);
	}
}

