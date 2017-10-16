package statickeyword;

/**
 * Static members cannot be inherited as they belong to class not objects(object are inherited)
 * 
 * Since we cannot inherit , when we try to override Static method , it does not take child's implementation 
 * instead it shows parent implementation only .
 * 
 * this concept is called Method Hiding.
 * 
 * Main() is static , so all static rule applied to main.
 * 
 * 
 * So when Static same signature is overriden by static same signature in Child=Method Hiding
 * So when Non Static  same signature is overriden by Non Static same signature in Child=Method Overriding
 * 
 * Imp: We cannot override static to non static or vice versa
 * @author vikrant.upadhayay
 *
 */



class ParentDemo1
{
	static String name="Vikrant";
	
	static void show()
	{
		System.out.println("Vikrant of Parents");
	}
	//We cannot override static to non static or vice versa
	void m1()
	{
		
	}
}

class childdemo1 extends ParentDemo1
{

	static void show()
	{
		System.out.println("Vikrant of Childs");
	}
	
	//We cannot override static to non static or vice versa
	//static void m1()
	{
		//compile time Error
		
		//This static method cannot hide the instance method from ParentDemo1
	}
	
}

public class StaticInheritance {
	

	public static void main(String[] args) {
		ParentDemo1 obj=new childdemo1();
		obj.show();  // when i put the cursor on warning text as below
		//The static method show() from the type ParentDemo1 should be accessed in a static way
		
		//Which shows O/P of Parent , this is called Method Hiding as child implementation for 
		//static method is not considered
	}


}
