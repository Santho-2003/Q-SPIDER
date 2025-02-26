package interview;
import java.util.ArrayList;
public class Extend 
{
public static void main(String[] args) 
{
	ArrayList list1=new ArrayList();
	ArrayList list2=new ArrayList();
	list1.add(1);
	list1.add(2);
	list2.add(3);
	list2.add(4);
	for(int i=0;i<list2.size();i++) 
	{
		list1.add(list2.get(i));
	}
	System.out.println(list1);
}
}
