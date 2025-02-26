package thiskeyword;
public class MobileOfClass 
{
  public static void main(String[] args)
  {
  Mobile m1=new Mobile("Redmi",25000,"Blue","R1");
  Mobile m2=new Mobile("Realme",20000,"Violet","RA1");
  Mobile m3=new Mobile("Vivo",35000,"Purple","V1");
  Mobile m4=new Mobile("Oppo",30000,"Pink","O1");
  System.out.println("Name\t\tPrice\t\tColor\t\tBrand");
  System.out.println("-------------------------------------------------------");
  System.out.println(m1.name+"\t\t"+m1.price+"\t\t"+m1.color+"\t\t"+m1.brand);
  System.out.println(m2.name+"\t\t"+m2.price+"\t\t"+m2.color+"\t\t"+m2.brand);
  System.out.println(m3.name+"\t\t"+m3.price+"\t\t"+m3.color+"\t\t"+m3.brand);
  System.out.println(m4.name+"\t\t"+m4.price+"\t\t"+m4.color+"\t\t"+m4.brand);
  
  } 
}
