package methodOverriding;

/**
 * 1. Method Override is process of changing the implementation of super class in child class
 * 2. While Overriding Return Type and Signature should be same
 * 3. Possible only when Super and Child exist ,  means inheritance
 * 4. With method overriding we can achieve Run Time Polymorphism, why because at run time ,object of class will decide which
 * method will be called
 * 
 * Abstract Method are always overriden , else they will throw compile time error
 * if not overriden in derived class
 * 
 * Method Overload vs 			Method Overriding ?
 * Compile time Polymorphism  		Run time Polymorphism
 * 
 * @author vikrant.upadhayay
 *
 */

class A
{
	void show ()
	{
		System.out.println("Parent method implementation");
	}
}

class B extends A  // Possible in case of inheritamce
{
	void show()  /// Return Type and signature same
{
		System.out.println("Child method implementation"); //child implementation is considered
}
}

public class MethodOverrideDefinition {
	
	public static void main(String[] args) {
		//Child Reference and Child Object , will call Child implementation as object is of Child
		B obj=new B();
		obj.show();
		
		//Parent Reference and Parent Object , will call Parent implementation as object is of Parent
		A obj1=new A();
		obj1.show();
	}


}
