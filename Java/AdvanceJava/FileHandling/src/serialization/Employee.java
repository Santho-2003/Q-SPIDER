package serialization;
import java.io.Serializable;
public class Employee implements Serializable
{
String name;
int emp_id;
double salary;
String cname;
public Employee(String name,int emp_id,double salary,String cname) 
{
	this.name=name;
	this.emp_id=emp_id;
	this.salary=salary;
	this.cname=cname;
}
}