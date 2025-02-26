class Faculty
{
	String name;
	int salary;
	int age;
	static String cname="qsp";
	public Faculty(String a,int b,int c)
	{
		name=a;
		salary=b;
		age=c;
	}
}
class FacultyOfMain
{
	public static void main(String[] args)
	{
		Faculty f1=new Faculty("San",30000,21);
		Faculty f2=new Faculty("Swe",35000,22);
		Faculty f3=new Faculty("Sivi",28000,23);
		Faculty f4=new Faculty("Sheela",32000,24);
		System.out.println("name\t\tsalary\t\tage\t\tcname");
		System.out.println("------------------------------------------------------");
	    System.out.println(f1.name+"\t\t"+f1.salary+"\t\t"+f1.age+"\t\t"+Faculty.cname);
		System.out.println(f2.name+"\t\t"+f2.salary+"\t\t"+f2.age+"\t\t"+Faculty.cname);
	    System.out.println(f3.name+"\t\t"+f3.salary+"\t\t"+f3.age+"\t\t"+Faculty.cname);
	    System.out.println(f4.name+"\t\t"+f4.salary+"\t\t"+f4.age+"\t\t"+Faculty.cname);
	}	
}