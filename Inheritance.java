package basic_java;
class Cone
{
	Cone(){
		System.out.println("Cone constructor");
	}
}
class Ctwo extends Cone
{
	Ctwo()
	{
		System.out.println("Ctwo constructor");
	}
}
class Cthree extends Ctwo{
	Cthree(){
		System.out.println("Cthree constructor");
	}
		
}
class Inheritance {
	public static void main(String[] args)
	{
	Cthree c=new Cthree();
	}
}

