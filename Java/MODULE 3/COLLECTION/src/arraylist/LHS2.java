package arraylist;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
public class LHS2 
{
public static void main(String[] args) 
{
	LinkedHashSet lhs=new LinkedHashSet();
	System.out.println("Insertion Before Sorting");
	lhs.add("Cricket");
	lhs.add("Hockey");
	lhs.add("Volleyball");
	lhs.add("Khokho");
	lhs.add("Tennis");
	lhs.add("Boxing");
	lhs.add("Kabadi");
	lhs.add("Football");
	System.out.println(lhs+" ");
	System.out.println();
	System.out.println("After Sorting");
	//Upcasting
	List l=new ArrayList(lhs);
	Collections.sort(l);
	System.out.print(l+" ");	
}
}
