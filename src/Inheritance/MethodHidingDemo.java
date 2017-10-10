package Inheritance;

/**
 * Method Hiding is done by overriding a static  Method in child class, hides Child Method
 * @author vikrant.upadhayay
 *
 */

class SuperATest
{
	static void Fight()
	{
		System.out.println("i fight");
	}
}

class SuperBTest extends SuperATest
{
	static void Fight()
	{
		System.out.println("i kill parent method");
	}
}
public class MethodHidingDemo {
	
	public static void main(String[] args) {
		SuperATest obj=new SuperBTest();
		obj.Fight();
	}
	

}
