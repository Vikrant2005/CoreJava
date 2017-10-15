package methodOverriding;

/**
 * Rule2:
 * 1. If Base overriden method throws Exception , Derived class method 
 * 		1. Can throw same Exception
 * 		2. Exception of Sub Type of Parent Exception (because assigning Super Exception will
 * not in sync with Exception herarchy)
 * 		3. Decide not to throw
 * @author vikrant.upadhayay
 *
 */

class Parent6
{
	void show() throws RuntimeException
	{
		
	}
}

class Child6 extends Parent6
{
	void show() throws RuntimeException //same exception
	{
		
	}
}

public class OverridingExceptionRule2 extends Child6{
	
	//void show() throws Exception //Compile time Error
	//	void show() throws RuntimeException //same exception
	void show() throws ArithmeticException //loweer hirarchy exception
	{
		
	}


}
