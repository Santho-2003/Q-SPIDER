package arraylist;
import java.util.ArrayList;

public class ArrayList2 
{
public static void main(String[] args) 
{
	ArrayList a2= new ArrayList();
	System.out.println("Insertion");
	a2.add("Santho");
	a2.add("Srimah");
	a2.add("Sheela");
	a2.add("Sownd");
	System.out.println(a2+" ");
	System.out.println();
	System.out.println("Read/Reterival");
	System.out.println(a2.get(3)+" ");
	System.out.println();
	System.out.println("Size");
	System.out.println(a2.size()+" ");
	System.out.println();
	a2.clear();
	System.out.println(a2+" ");
	System.out.println(a2.isEmpty()+" ");
	
}
}
