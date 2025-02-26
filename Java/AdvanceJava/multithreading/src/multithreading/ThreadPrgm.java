package multithreading;

public class ThreadPrgm extends Thread
{
public void run() 
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
	}
	System.out.println("Id of an user defined thread:"+Thread.currentThread().getId());
}
public static void main(String[] args) 
{
	System.out.println("Id of an main thread:"+Thread.currentThread().getId());
	ThreadPrgm p=new ThreadPrgm();
	p.start();
}
}
