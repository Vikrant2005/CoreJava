/**Point 1
 * overloading--Compile time Polymorphism  
 * Overriding--Runtime Polymorphism
 * 
 * Point 2
 * Overloading :Same method name Different Signtaure 
 * Overriding: Same name and Signature
 */

package Methodoverloading;

class SuperClassTest{
	
	/**
	 * Overloading in Super Class where Same Name and Different Signature
	 * 
	 * Exeuction can be predicted at compile time
	 * @param i
	 */
	
	void search( int i)
	{
		System.out.println("Searched Integer:"+i);
	}
	
	void search( int i,int j)
	{
		System.out.println("Searched Integer:"+i);
	}
}

class ChildClassTest extends SuperClassTest
{
	/**
	 * Same method and Signature-method Overrided--Run time Identification
	 */
	void search (int i )
	{
		System.out.println(" Searched Integer but overrided");
	}
}

public class OverloadingvsOverriding {
	
	public static void main(String[] args) {
		SuperClassTest sct=new ChildClassTest();
		sct.search(5);  // search was present in both parent and child , but run time Child Method /overriden method is Picked
		sct.search(5, 10); // Same method name in line 47 and 48 , compile time polymorphism by using Parent Refernce
	}

}
