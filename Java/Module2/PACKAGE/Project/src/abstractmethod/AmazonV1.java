package abstractmethod;
abstract public class AmazonV1 
{
   public static void login()
   {
   System.out.println("Login Done");
   }
   public static void shop()
   {
	   System.out.println("Shopping Done");
   }
   public static void prime()
   {
	   System.out.println("Prime Done");   
   }
   abstract public void paybills();
   public static void logout()
   {
	   System.out.println("Logout Done");
   }
}
