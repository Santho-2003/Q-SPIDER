package objectclass;
public class MainClass 
{
public static void main(String[] args) 
{
  Faculty f1=new Faculty("Subham",478096162048l,36,5000);
  Faculty f2=new Faculty("Srikanth",478096162043l,30,4000);
  Faculty f3=new Faculty("Prajwal",478096162042l,29,4000);
  Faculty f4=new Faculty("Vikram",478096162041l,30,5000);
  System.out.println(f1.hashCode());
  System.out.println(f2.hashCode());
  System.out.println(f3.hashCode());
  System.out.println(f4.hashCode());
  System.out.println(f1);
  System.out.println(f2);
  System.out.println(f3);
  System.out.println(f4);
}
}
