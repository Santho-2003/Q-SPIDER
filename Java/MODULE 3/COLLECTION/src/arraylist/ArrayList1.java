package arraylist;
import java.util.ArrayList;
public class ArrayList1 
{
public static void main(String[] args) 
{
	ArrayList a1=new ArrayList();
	System.out.println("Insertion");
	a1.add(1);
	a1.add("Two");
	a1.add(3);
	a1.add("Four");
	a1.addFirst("Hello");
	a1.addLast("Bye");
	System.out.println(a1+" ");
	System.out.println();
	System.out.println("Updation");
	a1.set(1, 2);
	System.out.println(a1+" ");
	System.out.println();
	System.out.println("Read/Retrival");
	a1.get(1);
	System.out.println(a1+" ");
	System.out.println();
	System.out.println("Removal");
	a1.clear();
	System.out.println(a1+" ");
}
}
