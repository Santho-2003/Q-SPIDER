package treeset;
import java.util.TreeSet;
public class TreeSet 
{
public static void main(String[] args) 
{
	TreeSet ts= new TreeSet();
	/*System.out.println("Insertion of null elements");
	ts.add(null);
	ts.add(null);
	ts.add("null");
	System.out.println(ts+" ");//throws null pointer exception*/
	System.out.println("Insertion of heterogeneous elements");
	ts.add("hello");
	ts.add(4);
	ts.add(true);
	ts.add(10.10);
	ts.add(100f);
	System.out.println(ts+" ");
}
}
