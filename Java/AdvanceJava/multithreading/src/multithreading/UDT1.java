package multithreading;
public class UDT1 extends Thread //step1: define class & extends thread class
{
public void run() //step2: override run() method
{
	System.out.println("Starts execution");
	for(int i=1;i<=10;i=i+2) 
	{
		System.out.println(i);// implementation code executed by user defined thread
	}
}
public static void main(String[] args) //step3: define main() method
{
	UDT1 udt=new UDT1();//step4: create object of an class
    udt.start();//step5: invoke start() method
}
}
