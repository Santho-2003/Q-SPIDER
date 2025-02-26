package arraylist;
import java.util.HashSet;
public class LHSProgram 
{
public static void main(String[] args) 
{
	HashSet hs= new HashSet();
	System.out.println("-----Insertion-----");
	hs.add(1);
	hs.add(1);
	hs.add(null);
	hs.add(null);
	hs.add(2);
	hs.add("Start");
	hs.add("End");
	System.out.println(hs+ " ");
	System.out.println();
	System.out.println("----Updation----");
	hs.remove("End");
	hs.remove("Start");
	hs.remove("Entry");
	hs.remove("Exit");
	System.out.print("After Updation: "+hs+" ");
	System.out.println();
	System.out.println("----Removal----");
	hs.remove(null);
	hs.remove(1);
	System.out.println("After removal: "+hs+" ");
	System.out.println();
	System.out.println("----Searching----");
	System.out.println(hs.contains(1));
	System.out.println("----Read----");
	for(Object obj : hs)
	{
	System.out.println(obj+" ");
	}
}
}
