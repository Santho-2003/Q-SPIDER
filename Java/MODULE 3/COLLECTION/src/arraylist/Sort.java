package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class Sort 
{
public static void main(String[] args) 
{
	ArrayList a1=new ArrayList();
	System.out.println("Insertion");
	a1.add(11);
	a1.add(4);
	a1.add(12);
	a1.add(19);
	a1.add(22);
	a1.add(28);
	System.out.println(a1);
	System.out.println("Before Sorting");
	System.out.println(a1+" ");
	System.out.println("After Sorting");
	Collections.sort(a1);
	System.out.println(a1+" ");
	System.out.println(a1.contains(4));
	System.out.println();
	System.out.println("Removal");
	a1.clear();
	System.out.println(a1);
	System.out.println();
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	
	
	
}
}
