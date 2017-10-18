package Abstraction;

/*
 * Abstract Kewyword to make method without implementation abstarct
 * 
 * If a class have Abstract Method , it should alse be declared as Abstract ,else it will throw Compile time Error
 * 
 * The type AbstractClassDemo must be an abstract class to define abstract methods
 */

public abstract  class AbstractClassDemo {
	
	abstract void A();

}

class Derived extends AbstractClassDemo  // Abstract class can be inherited
{

	@Override
	void A() {
		System.out.println("child method");
		
	}
	
}


class Driver
{
	public static void main(String[] args) {
		//AbstractClassDemo obj=new AbstractClassDemo();// Cannot create instance of or Object of Abstract Class
		
		AbstractClassDemo obj=new Derived();
		obj.A();
	}
}