package multithreading;
public class UDT2 implements Runnable
{
public void run() 
{
	System.out.println("starts execution");
	for(int i=2;i<=10;i+=2) 
	{
		System.out.println(i);
	}
	System.out.println("stop execution");
}
public static void main(String[] args)
{
	UDT2 udt=new UDT2();
	Thread ts=new Thread(udt);//extra step to be used to execute using runnable interface needs the thread object
	ts.start();
	
}
}
