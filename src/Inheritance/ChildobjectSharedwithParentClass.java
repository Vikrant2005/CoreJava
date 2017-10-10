/**
 * Child Object Shared with Parent CLass, using Parent Class Reference we can assess only Parent members
 * 
 * we can access both Parent and Child Members
 * 
 * Here Hero() method is overriden and will show "Run Time Polymorphism"
 */
package Inheritance;

class ChildClassA extends SuperClassforPrograms{
	
String s="vikrant";
static String d="Jamun";

int i=25;

	public void Hero()
	{
		System.out.println(" I am Super Hero's Child");
	}
	
	public void Fight()
	{
		System.out.println(" I can Fight");
	}
	
	/*
	 * Static method override in Child cabe done by putting same signature
	 */
	 public static void Fly()
	{
		System.out.println(" I can Fly in Child");
	}
	 


	
}

public class ChildobjectSharedwithParentClass {
	
	public static void main(String[] args) {
		SuperClassforPrograms obj=new ChildClassA();
		obj.Hero();
		// Method from Child Class is called , as right side is Child's object which determine method at Runtime
		//Hence an Example of Runtime Polymorphism
		obj.Fly();
		System.out.println(obj.i);
	//	obj.Fight(); //cannot Access this with Parent Refernce as this is compile time Determination
		//obj.s-Error
		
		/*
		 * O/P:
		 *  I am Super Hero's Child
		 *  I can Fly
		 *  10
		 */
		
		System.out.println("==========================================");
		ChildClassA obj2=new ChildClassA();  //Child CLass Refernce and CHild Classs Object
		System.out.println(obj2.i);
		obj2.Fly();// Access parent Method using Child Object and Reference
		obj2.Fight();// Access  Child method using Child Object and Reference
		obj2.Hero();// Access parent Method using Child Object and Reference
		
		/*
		 * 25  Variable Override only for Child Object and Reference	
I can Fly
 I can Fight
 I am Super Hero's Child
		 */
		
		System.out.println("==========================================");
		SuperClassforPrograms obj3=new SuperClassforPrograms();  //Super CLass Refernce and Super Classs Object
		System.out.println(obj3.i);
		obj3.Fly();// Access parent Method using Child Object and Reference
		//obj3.Fight();// Cannot Access  Child method using Parent Object and Reference
		obj3.Hero();// Access parent Method using Child Object and Reference
		
		
	}
	
	

}
