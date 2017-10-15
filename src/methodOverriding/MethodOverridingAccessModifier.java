package methodOverriding;

/**
 * There is a rule , when we override Parent method , the visibility if access modifier should increase
 * 
 * and this should be followed in immediate Parent or Child
 * 
 * Private->Default->Protected->Public
 * @author vikrant.upadhayay
 * 
 *
 */

class Parent1
{
	private void show()
	{
		
	}
	
	 void show1()
	{
		
	}
}

class Child1 extends Parent1
{
	 void show()
	{
		
	}
	 
	protected void show1()// private void show1() // Compiler Error cannot reduce the visibility of inherited method from A
		{
			
		}
}

class C extends Child1
{
	 protected void show()
	{
		
	}
}

class D extends C
{
	 protected void show()
		{
			
		}
}
public class MethodOverridingAccessModifier {

}
