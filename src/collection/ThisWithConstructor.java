package collection;
/**
 * This () used to call constructor of same class
 * 
 * This() should be first line of code inside constructor
 * 
 * We cannot have more than 1 this () statement in constructor
 * 
 * @author vikrant.upadhayay
 *
 */
public class ThisWithConstructor {
	
	ThisWithConstructor()
	{
		this(10);
		System.out.println("ThisWithConstructor()");
		//this(10); // Compile Time Error: Constructor Call must be first statement in constructor
		//because of above Compile Time Error -- We have constraints like First statement and 1 time usage.
	}
	
	ThisWithConstructor(int i)
	{
		this("Vikrant");
		System.out.println("ThisWithConstructor(int i)");
		
	}
	
	ThisWithConstructor(String s)
	{
		this('A');
		System.out.println("ThisWithConstructor(String s)");
	}
	
	ThisWithConstructor(char c)
	{
		System.out.println("ThisWithConstructor(char c)");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor();
	}

}
