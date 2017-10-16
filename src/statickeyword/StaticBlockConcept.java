package statickeyword;

/**
 * 1. Static block executes before main and without main
 * 2. Priority is always Static block as compared to Main()
 * 
 * 3. Static block access Static Members only 
	4. Non Static Block access both
	
	If you need to do computation in order to initialize your static variables, 
	you can declare a static block that gets executed exactly once, when the class is first loaded
 * @author vikrant.upadhayay
 *
 */

public class StaticBlockConcept {
	
	static
	{
		System.out.println("Static  execute without Main");
		checkLicense();
		//partNumber(); // compile time error
		//Cannot make a static reference to the non-static method partNumber() from the type StaticBlockConcept
	}
	
	static
	{
		System.out.println("Static  execute before Main");
	}
	
	//Constructor
	StaticBlockConcept()
	{
		System.out.println("Constructor");
	}
	
	static void checkLicense()
	{
		System.out.println("License Issued");
	}
	
	 void partNumber()
	{
		System.out.println("PartNumber Issued");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("This is main execution ");
		
		StaticBlockConcept obj=new StaticBlockConcept();
	
	}
	



}

/*
 * O/P
 * Static  execute without Main
Static  execute before Main
This is main execution */

