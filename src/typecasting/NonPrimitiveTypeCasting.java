package typecasting;

/**
 * Upcasting and Downcasting of Objects is called Non Primitive Type Casting
 * 
 * Casting helps us in Achieving Run time Polymorphism by 
 * 
 * 	1. Assigning Child Object to Parent Refence
 * 	2. Parent obj=new Child(); ->Upcasting
 * 	3. It helps in determining required overriden methods at run time
 * 
 * 2 point is very important , as if this concept is not there we cannot assign child object to Parent Reference
 * as Parent Object can access only it's members , in case of overriding we can take child implementation of Parent method.
 *
 * @author vikrant.upadhayay
 *
 */

class Veg
{
	void cook()
	{
		System.out.println("Cooking");
	}
	
	void Chop()
	{
		System.out.println("Chopping");
	}
}

class Carrot extends Veg
{
void prepareHalwa()
{
	System.out.println("Prepare Halwa");
}
	
	void Chop()
	{
		System.out.println("Carrot Chopping");
	}
}

public class NonPrimitiveTypeCasting {
	public static void main(String[] args) {
		System.out.println("Veg Object Veg Reference");
		Veg obj=new Veg();
		obj.Chop();
		obj.cook();
		System.out.println("Carrot Object Carrot Reference");
		Carrot obj2=new Carrot();
		obj2.Chop();
		obj2.cook();
		obj2.prepareHalwa();
		
		System.out.println("Carrot Object Veg Reference");
		Veg obj3=new Carrot();
		obj3.Chop();  //chop() Child's implementtion taken
		obj3.cook();
	}

}
