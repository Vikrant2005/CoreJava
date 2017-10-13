package Constructor;
/**
 * This () used to call constructor of same class
 * 
 * This() should be first line of code inside constructor
 * 
 * We cannot have more than 1 this () statement in constructor
 * 
 * This process is called as Constructor Chaining
 * 
 * @author vikrant.upadhayay
 *
 */
public class ConstructorChaining {
	
	ConstructorChaining()
	{
		this(10);
		System.out.println("ThisWithConstructor()");
		//this(10); // Compile Time Error: Constructor Call must be first statement in constructor
		//because of above Compile Time Error -- We have constraints like First statement and 1 time usage.
	}
	
	ConstructorChaining(int i)
	{
		this("Vikrant");
		System.out.println("ThisWithConstructor(int i)");
		
	}
	
	ConstructorChaining(String s)
	{
		this('A');
		System.out.println("ThisWithConstructor(String s)");
	}
	
	ConstructorChaining(char c)
	{
		System.out.println("ThisWithConstructor(char c)");
	}
	
	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining();
	}

}
