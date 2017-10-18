package Abstraction;

/*
 * In Abstraction ,constructor of Abstract class is called during Instance creation of child/inherited class
 */

abstract class Base1 {//Abstract Class without Abstract Method 
	//This is used when we do not want Developer to create instance of class ,but we allow inheritance

	Base1()
	{
		System.out.println("Base Constructor Called");
	}
}	

class Derived1 extends Base1
{
	Derived1()
	{
		System.out.println("Derived Constructor Called");
	}
}

public class AbstractConstructor
{
	public static void main(String[] args) {
		Derived1 obj=new Derived1();
	}
}