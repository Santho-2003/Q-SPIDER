package linkedlist;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList1 
{
public static void main(String[] args) 
{
	LinkedList l1=new LinkedList();
	System.out.println("Insertion");
	l1.add("Java");
	l1.add("Sheela");
	l1.add("Fathima");
	l1.add("Harini");
	l1.add("Bro");
	l1.add("Leo");
	l1.add("Lang");
	System.out.println(l1+" ");
	System.out.println();
	System.out.println("Updation");
	l1.set(4,"Harsha");
	System.out.println(l1+" ");
	System.out.println();
	System.out.println("Read/Retrival");
	System.out.println(l1.get(3));
	System.out.println();
	System.out.println("Sorting");
	Collections.sort(l1);
	System.out.println(l1+" ");
	System.out.println();
	System.out.println(l1.size());
	l1.clear();
	System.out.println(l1.isEmpty());
	
	
	
	
}
}
