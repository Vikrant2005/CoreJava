package collection;
/**
 * 2 Type of Constuctor
 * 
 * 1.User Defined
 * 	a. User Defined Parametrized
 * 	b. User Defined Non Parametrized
 * 
 * 2. Default 
 * Create by Compiler
 * even you write name or not it's there
 * Eg:TypesOfConstructors()
 * @author vikrant.upadhayay
 *
 */
public class TypesOfConstructors {
	
	//default or sometime is invisible if we have us
	/*TypesOfConstructors()
	{
		
	}*/
	//User Defined Parametrized
	
	TypesOfConstructors(int a)
	{
		System.out.println(" User defined Parametrized");
	}
	
	TypesOfConstructors()
	{
		System.out.println(" User defined Non Parametrized");
	}
	
	public static void main(String[] args) {
		TypesOfConstructors obj=new TypesOfConstructors();
		TypesOfConstructors obj2=new TypesOfConstructors(5);
	}
	
	

}
