package basic_java;
abstract class Animal
{
	 abstract void eat();
}
 class Tiger extends Animal
{
	void eat()
	{
		System.out.println("I eat only Non-Vegetarian");
	}
}
class Goat extends Tiger
{
	void eat()
	{
		System.out.println("I eat only Vegetarian");
	}
}
class Animal1 {
	public static void main(String[] args)
	{
		Animal m;
		m=new Tiger();
		m.eat();
		m=new Goat();
		m.eat();
		
	}

}
