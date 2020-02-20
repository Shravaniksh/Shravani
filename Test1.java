package basic_java;
class Student1
{
	String name;
	Student1(String s)
	{
		name=s;
	}
	String getName()
	{
		return name;
	}
	
}
class Student2
{
	String name1;
	Student2(String a)
	{
		name1=a;
	}
	String getName()
	{
		return name1;
	}
}

public class Test1 {
	public static void main(String[] args)
	{
		Student1 s1=new Student1("John");
		Student2 s2=new Student2("Mary");
		System.out.println("s1="+s1.getName());
		System.out.println("s2="+s2.getName());
	}

}
