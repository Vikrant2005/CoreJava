package methodOverriding;

/**
 * After Java 5 we can change the Return Type while doing override , just we need to note 
 * that Return type of Derived method must be subtype of Return Type of Base methods
 * 
 * This is know as "Covariant Return Type"
 * @author vikrant.upadhayay
 *
 */

class Aa
{
	
}

class Bb extends A
{
	
}

class Parent3
{
	A show()
	{System.out.println("Base Show()");
		return new A();
	}
}

class Child3 extends Parent3
{
	B show()  //return type can be same or "subtype" of Parents return type
	{	System.out.println("Derived Show()");
		return new B();
	}
}
public class OverrideMethodDifferentReturnType {
	
	public static void main(String[] args) {
		
		Parent3 obj=new Parent3();
		obj.show();
		
		Child3 obj2=new Child3();
		obj2.show();
		
		Parent3 obj3=new Child3();
		obj3.show();
	}
	

}
