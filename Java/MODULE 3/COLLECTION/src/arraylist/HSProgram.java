package arraylist;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class HSProgram 
{
  public static void main(String[] args) 
  {
	  LinkedHashSet ths= new LinkedHashSet();
	  System.out.println("Insertion");
	  ths.add("INDIA");
	  ths.add("USA");
	  ths.add("UK");
	  ths.add("GERMANY");
	  ths.add("LONDAN");
	  System.out.println(ths+" ");
	  System.out.println("Updation");
	  ths.remove("GERMANY");
	  ths.add("RUSSIA");
	  System.out.println("After Updation"+ths+ " ");
	  System.out.println();
	  System.out.println("Read Elements");
	  Iterator itr= ths.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next()+" ");
	  }
  }
}
