package Abstraction;

/*
 * Abstract is written before class keyword on Class Signature
 * 
 * We can have final method(method that cannot be overriden) in Abstract class
 */

abstract class AbstractTest
{
	final void show()
	{
		System.out.println(" Abstract can have Final Method");
	}
}

class Derived2 extends AbstractTest
{
	
}

public class AbstractCanHaveFinal {
public static void main(String[] args) {
	Derived2 obj=new Derived2();
	obj.show();  //O/P: Abstract can have Final Method
}
}
