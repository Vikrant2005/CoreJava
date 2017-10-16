package statickeyword;
/**
 * Static Variable single copy shared among all objects of class
 * 
 * Static are essentially Global/instance Variable
 * 
 * Imp:Static variable are created at Class Level Only , as local variable are used once method is called 
 * via object hence they have to  be associated to an Object
 * 
 * static block and static variables are executed in order they are present in a program.
 * 
 * @author vikrant.upadhayay
 *
 */

public class StaticVariableExecutionSequence {
	
	//static block and static variables are executed in order they are present in a program.
	
	   static {
	        System.out.println("Inside static block");
	    }
	
	static int b=m1();
	

	
	static int m1()
	{
		System.out.println("Staic Method");
		return 10;
				
	}
	

	
	public static void main(String[] args) {
		System.out.println( "Value of b:" +b);
		System.out.println(" main");
	}

}
