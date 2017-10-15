package methodOverriding;

/**
 * Static Method cannot be overriden
 * 
 * If done ,that is Method hiding as it will not show child implementation
 * 
 * 						Super Class Instance Method			Super Class Static Method
 * Subclass instance		Override							Compile time Error
 * Subclass Static			Compile Time Error					Method Hiding
 * @author vikrant.upadhayay
 *
 */

class ParentTest
{
	static void m1()
	{
		System.out.println(" m1 in Parent");
	}
	
	void m2()
	{
		System.out.println(" m2 in Parent");
	}
}

class ChildTest extends ParentTest
{
	static void m1()
	{
		System.out.println(" m1 in Child"); // this method got hidden
	}
	
	 void m2()
	{
		System.out.println(" m2 in Child");
	}
}
public class StaticMethodOverriden {
	
	public static void main(String[] args) {
		ParentTest obj=new ChildTest();
		obj.m2();
		obj.m1();  //if we call using child object m1 of parent is called
		ChildTest.m1(); //directly calling method with class name can get class implementation
		
		ChildTest obj2=new ChildTest();
		obj2.m1();// this also will give child implementation
	}
	
	
	
	

}
