package typecasting;
/**
 * Java does not support downcasting but it can be done explicitly
 * 
 * If we do it directly ,compiler will throw "class cast exception"
 * 
 * In jave to achieve downcasting ,Upcasting is required , 
 * without Upcasting we cannot achieve downcasting
 * 
 * @author vikrant.upadhayay
 *
 */

class Vegetable
{
 void cook()
 {
	 System.out.println("Cooking");
 }
}

class Chilly extends Vegetable
{
 void chilly ()
 {
	 System.out.println("Chilling");
 }
}

public class DowncastingDemo {
	
	public static void main(String[] args) {
		
		//Direct Downcasting
		Vegetable v=new Chilly(); // upcasting
		
		//Chilly c=new Veg(); // compile time Error
	/*	try
		{
		Chilly c=(Chilly)new Vegetable();
		c.chilly();
		c.cook();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}*/

		//Above Code will throw
		//Exception in thread "main" java.lang.ClassCastException: 
		//typecasting.Vegetable cannot be cast to typecasting.Chilly
		//at typecasting.DowncastingDemo.main(DowncastingDemo.java:38)
	
		//Indirect Approach using upcasted reference variable
		
		Chilly c1=(Chilly)v;
		c1.chilly();
		c1.cook();
	}

}
