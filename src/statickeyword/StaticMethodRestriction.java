package statickeyword;
/**
 * Static Methods have restriction 
 * 	1. They can directly call another static method.
 * 	2. They can only directly access static members
 * 	3. They cannot refer to this and Super
 * @author vikrant.upadhayay
 *
 */

public class StaticMethodRestriction {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{ a=20;  // Direct Access
		//b=10;  Compile Time Error:Cannot make a static reference to the non-static field b
	
	//m2();//Compile time Error
	//Cannot make a static reference to the non-static method m2() from the type StaticMethodRestriction
	
	//System.out.println(super.a); //Compile Time Error
	//3.Cannot use super in a static context
	
	//System.out.println(this.a);//3.Cannot use static in a static context
	//System.out.println(this.b);////3.Cannot use super in a static context
	}
	
	
	void m2()
	{
		System.out.println("From m2");
	}

}
