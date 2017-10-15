package methodOverriding;

/**
 * Final methods cannot be overriden 
 * @author vikrant.upadhayay
 *
 */

class Parent
{
	final void show()
	{
		System.out.println("Parent Method");
	}
}

class Child extends Parent
{
	 //void show()  // Compile Time Error:Cannot override Final Method from Parent
	{
		 System.out.println("Child Method");
	}
}

public class FinalMethodOverridingRules {

}
