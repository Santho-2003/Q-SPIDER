//WAP to create Linkedhashset and perform insertion, updation, 
//remove, removeAll,searching
package arraylist;
import java.util.LinkedHashSet;
public class LHS1 
{
public static void main(String[] args)
{
	LinkedHashSet lhs=new LinkedHashSet();
	System.out.println("Insertion");
	lhs.add("Santho");
	lhs.add("Shahinaeee");
	lhs.add("Rya");
	System.out.println(lhs+" ");
	System.out.println();
	System.out.println("Searching");
	System.out.println(lhs.contains("Santho"));
	System.out.println(lhs.contains("Shahin"));
	System.out.println("Removal");
	lhs.remove("Rya");
	System.out.println(lhs+" ");
	lhs.removeAll(lhs);
	System.out.println("After RemovalAll"+lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
}
}
