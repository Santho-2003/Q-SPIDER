package interview;
public class Case
{
public static void main(String[] args) 
{
	String s="SNTOHNahsii";
	String upper="",lower="";
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			upper=upper+ch;
		}
		else if(ch>='a'&&ch<='z')
		{
			lower=lower+ch;
		}
	}
	System.out.println("lower:"+lower);
	System.out.println("upper:"+upper);
}
}
