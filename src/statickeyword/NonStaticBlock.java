package statickeyword;

/**
 * Non Static Block executed at the time of object creation
 * 
 * Priority : Static -> Non Static -> Constructor
 * 
 * Non Static blocks ar "Instance Initilaization Block"
 * 
 * Non Static block allow both Static and non Static members of the class
 * 
 * Static block allows only static members of class
 * 
 * 1 Copy of static memebers , n copy of non static members
 * @author vikrant.upadhayay
 *
 */

public class NonStaticBlock {
	
	{
		System.out.println("Non Static Block");
	}
	
	{
		System.out.println("Non Static Block 2");
	}
	
	{
		System.out.println("Non Static Block 3");
	}
	
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	static {
		System.out.println("Static Block 3");
	}
	
	NonStaticBlock()  //non static block
	{
		System.out.println("Constructor");
		m1();  //non static
		m3();  //static 
	}
	
	void m1()
	{
		System.out.println("m1()");
	}
	
	void m2()
	{
		System.out.println("m2()");
	}
	
	static void m3()
	{
		System.out.println("m3()");
	}
	
	static void m4()
	{
		System.out.println("m4()");
	}
	
	public static void main(String[] args) {
		NonStaticBlock obj=new NonStaticBlock();
	}

}
/*
Static Block 1
Static Block 2
Static Block 3
Non Static Block
Non Static Block 2
Non Static Block 3
Constructor
*/
