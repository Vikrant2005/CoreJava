package typecasting;

import javax.print.attribute.IntegerSyntax;

class Animal
{}
class Cat extends Animal
{}
class Cow extends Animal
{}
class Monkey extends Animal
{}

class Display
{
	void convert(Animal a)  //Upcasting ..loose coupling also
	{
		if (a instanceof Cat)
		{
			Cat c=(Cat)a;  //Downcasting
			System.out.println("Animal converted to Cat");
		}
		else if(a instanceof Cow)
		{
			Cow c=(Cow)a; 
			System.out.println("Animal converted to Cow");
		}
		
		else if(a instanceof Monkey)
		{
			Monkey c=(Monkey)a; 
			System.out.println("Animal converted to Monkey");
		}
	}
}


public class InstanceOfOperator {
	public static void main(String[] args) {
		Display obj=new Display();
		obj.convert(new Cat());  //sending different object to be accepted by Parent /Derived Class called Loose Coupling
		obj.convert(new Cow());
		obj.convert(new Monkey());
	}

}
