package statickeyword;

/**
 * Static can be applied to Class , method , variable ,blocks
 * Single Memory Allocation
 * 
 * Static is non Access Modifier
 * 
 * Belongs to class , can be called without creating Object
 * 
 * Within a same class calling
 * 		1. Static to Static method calling can be done by ClassName or Direct Name
 * 		2. Non Static  to Static method calling can be done by Object Name
 * 		3. Non Static to Non Static , direct name or object
 * 		4. Static to Non Static same as 1.
 * 
 *  * In Different class class calling
 * 		1. Static to Static method calling can be done by ClassName only
 * 		2. Non Static  to Static method calling can be done by Object Name
 * 		3. NS->NS object only
 * 		4. Static to NS same as 1.
 * 
 * @author vikrant.upadhayay
 *
 */

public class StaticDefinition
{
	static void staticdemo()
	{
		System.out.println("staticdemo():Static to Static called by Class Name or DirectName");
	}	
	void nonstaticdemo()
	{
		System.out.println("nonstaticdemo() : Non Static to Static called by Object Name");
		
	}
	
	static void staticdemo1()
	{
		System.out.println("staticdemo1() : Static to Non Static called by Class Name only");
	}	
	void nonstaticdemo1()
	{
		System.out.println(" nonstaticdemo1() : Non Static to NonStatic called by Object Name/directly");
		nonstaticdemo();// direct name method call non static to non static
		staticdemo1();  // by name
		StaticDefinition.staticdemo1(); //by classname
	}
	
	public static void main(String[] args) {
		//calling static->static in same class
		staticdemo();         //Direct name call
		StaticDefinition.staticdemo();/// call with classname
		//calling non static->static in same class
		StaticDefinition obj=new StaticDefinition();
		obj.nonstaticdemo();
		staticdemo1();
		obj.nonstaticdemo1();
		
	}
}


