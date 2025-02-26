package treeset;
import java.util.TreeSet;
public class TS1 
{
public static void main(String[] args) 
{
	TreeSet ts=new TreeSet();
	System.out.println("Insertion");
	ts.add(10);
	ts.add(15);
	ts.add(6);
	ts.add(7);
	ts.add(1);
	System.out.println(ts+" ");//natural sorting order
	System.out.println("Read Element");
	System.out.println(ts.first());
	System.out.println(ts.last());
	System.out.println(ts.lower(15));
	System.out.println(ts.higher(1));
	/*System.out.println(pollFirst()+" "pollLast());*/
	System.out.println("Size of an collection");
	System.out.println(ts.size());
	System.out.println(ts+" ");
	System.out.println("Empty:"+ts.isEmpty());
}
}
