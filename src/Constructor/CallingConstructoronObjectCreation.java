package Constructor;
/**
 * Construct is called during Object Creation
 * 
 * Eg:Aconstructor obj=new Aconstructor();  statement
 * 
 * We create object of constructor not class
 * 
 * @author vikrant.upadhayay
 *
 */
class Aconstructor
{
	Aconstructor()
	{
		System.out.println("Object Creation Call");
	}
}



public class CallingConstructoronObjectCreation {
	
	public static void main(String[] args) {
		Aconstructor obj=new Aconstructor();
		
	}

}
