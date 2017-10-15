package methodOverriding;

/**
 * Rule1 :
 * 
 * If Parent Class overriden methods does not throw exceptions, Child class can only
 * and only throw unchecked exception (eg:ArithmeticException)
 * @author vikrant.upadhayay
 * 
 * Throwing checked exception will lead to compile time Error
 *
 */

class Parent5{  // none of my method of base class throws exception
	void m1()
	{
		System.out.println("I am m1 base");
	}
	
	void m2()
	{
		System.out.println("I am m2 base");
	}
}

public class OverrdingExceptionRule1 extends Parent5 {
	
	void m1() throws ArithmeticException //Allows unchecked exception
	{
		System.out.println("I am m1 Derived");
	}
	
	//void m2() throws Exception  //Compile time Error 
	//:Exception Exception is not compatible with throws clause in Parent5.m2()
	{
		System.out.println("I am m2 Derived");
	}

}
