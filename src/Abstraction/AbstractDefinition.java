package Abstraction;

/**
 * abstract is a Keyword to make Class and Method as abstract
 * 
 * abstract class have or do not have abstract method
 * 
 * abstract method have no implementation
 * 
 * Abstract Class have both Concrete and Abstract method
 * 
 * Abstract method must be overriden in inherited class
 * 
 * We cannot create object of Abstract class ( As Abstract class is incomplete as it have both Abstract and Concrete
 * Method)
 * 
 * @author vikrant.upadhayay
 *
 */

public abstract class AbstractDefinition {
	
	abstract void  show();  //Abstract Method :no implementation
	
	void fun()
	{
		//concrete method with implementation
	}

}

/*class Derived3 extends AbstractDefinition
{  //Compile time Error
	//The type Derived3 must implement the inherited abstract method AbstractDefinition.show()
}*/

class Derived3 extends AbstractDefinition
{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		//AbstractDefinition obj=new AbstractDefinition(); Compile time Error
		//as we are trying to create obhect of Abstract Class
	}
	
}
