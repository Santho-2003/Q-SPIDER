package loadingdriver;
public class LoadingDriver 
{
public static void main(String[] args) 
{
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loading Driver done successfully");
	}
	catch(ClassNotFoundException e) 
	{
		e.printStackTrace();
	}
}
}
