package serialization;
import java.io.Serializable;
public class Student implements Serializable
{
	String name;
	int age;
	int roll;
	public Student(String name,int age,int roll) 
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
}

