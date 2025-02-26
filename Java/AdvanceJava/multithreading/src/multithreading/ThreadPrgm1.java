package multithreading;
public class ThreadPrgm1 extends Thread
{
public void run() 
{
	System.out.println("user defined thread");
	System.out.println("Name of the thread:"+Thread.currentThread().getName());
	Thread.currentThread().setName("program1");
	System.out.println(Thread.currentThread().getName());
}
public static void main(String[] args) 
{
	System.out.println("main thread/thread main");
	System.out.println("Name of an main thread:"+Thread.currentThread().getName());
	Thread.currentThread().setName("main-thread");
	System.out.println(Thread.currentThread().getName());
	ThreadPrgm1 p=new ThreadPrgm1();
	p.start();
}
}
