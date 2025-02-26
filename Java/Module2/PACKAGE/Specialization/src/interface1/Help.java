package interface1;

public class Help 
{
public void get(Travel t)
{
	if(t instanceof Bus)
	{
		Bus b=(Bus) t;
		b.time();
	}
	else if(t instanceof Train)
	{
		Train t1=(Train) t;
		t1.time();
		
	}
	else if(t instanceof Car)
	{
		Car c=(Car) t;
		t.time();
	}
	else 
	{
		Flight f=(Flight) t;
		t.time();
	}
}
}
