package Constructor;
/**
 * Constructor overloading can be done by changing
 * 	1. Parameter Count
 * 	2. Changing Data Type
 * 	2. Changing Sequence
 * @author vikrant.upadhayay
 *
 */
public class ConsturctorOverloading {
	
	ConsturctorOverloading(int a , int b)
	{
		System.out.println("I have basic parameters");
	}
	
	ConsturctorOverloading(int a , int b , int c)  //changing count
	{
		System.out.println("I have more count");
	}
	
	ConsturctorOverloading(int a , String b, float c)  //changing Data Type
	{
		System.out.println("I have different Data Type");
	}
	
	ConsturctorOverloading(int a , String string,float p , char d)  //changing sequence 
	{
		System.out.println("I have changing Sequence");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsturctorOverloading obj=new ConsturctorOverloading(5,10);
		ConsturctorOverloading obj1=new ConsturctorOverloading(5,10,15);
		ConsturctorOverloading obj2=new ConsturctorOverloading(5,"Vikrant",11.0f);
		ConsturctorOverloading obj3=new ConsturctorOverloading(5,"Vikrant",10.9f,'A');

	}

}
