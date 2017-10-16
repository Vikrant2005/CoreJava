package finalkeyword;

/**
 * Final is a Access Modifier can be applied to variables, methods & Class
 *  1. Final Variable = Constant , value should not change and should be initialized once
 *  ( either in statement or by constructor)
 *  2. Final Method = Cannot be overriden
 *  3. Final Class= Cannot be Inherited
 *  4. Final Method= Can be Overloaded
 *  
 * 5. Object can be created for Final Class
 * @author vikrant.upadhayay
 *
 */

public final class  FinalKeywordDefinition {  //at class level

	final String name="Vikrant";  //1.Final variable required initialization , as it cannot be changed later
	
	//2nd Approach
	final String company;  //1.this statement will not give error , once we have constructor to initializae variable
	
	FinalKeywordDefinition()
	{
		this.company="Accenture";
	}
	
	final void finalMethoddemo()
	{
		System.out.println("This is final method");
	}
	// final method overloading done
	final void finalMethoddemo(String s)
	{
		System.out.println("This is Testfinal method");
	}
	
	public static void main(String[] args) {
		TestFinal.main("Sanvi");
	}
}

class TestFinal //2.extends FinalKeywordDefinition: Compile Time Error
// type TestFinal cannot subclass the final class FinalKeywordDefinition
{
// so final class cannot be inherited
	
	public static void main(String args) {
		FinalKeywordDefinition obj=new FinalKeywordDefinition(); //5.Object Created
		System.out.println(obj.company);  //Final variable accessed
		obj.finalMethoddemo();  //Final Method Accessed
		obj.finalMethoddemo("Golu");
	}
}
