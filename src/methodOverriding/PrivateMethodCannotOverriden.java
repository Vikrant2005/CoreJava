package methodOverriding;

/**
 * Private Method cannot be overriden
 * @author vikrant.upadhayay
 *
 */

class Parent2
{
	private void show()
	{
		System.out.println("Private Parent Class");
	}
}

class Child2 extends Parent2
{
	private void show()
	{
		System.out.println("Private Child Class");
	}
	
	public static void main(String[] args) {
		
		Parent2 obj3=new Child2();	
		//obj3.show();  //Compile time Error "The Method Show() from the type Parent2 is not visible , this means
		//method is not overriden as it is checking the visibility in Parent2 Class

		
	}
	
}
	

public class PrivateMethodCannotOverriden {
	

}
		
