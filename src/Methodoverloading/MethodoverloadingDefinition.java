/**
 * Method overloading having same method name with different Parameters
 * 
 * Overloading is Compile time , Static Polymorphism
 * 
 * Parameter :
 * 	1. Count can change.
 * 	2. Type can change
 * 	3.Sequence can change
 * 
 * Return type is not considered
 * 
 * Application:Searching Purpose based on value
 * 
 * Advantage no need to create Method with different name , and remember their name
 */
package Methodoverloading;

public class MethodoverloadingDefinition {
	
	void search (int a)
	{
		System.out.println("1 integer Search");
	}
	
	void search (int a,int b)
	{
		System.out.println("2 integer Search");
	}
	/**
	 * Change of Sequence of Parameter and Return Type
	 * 
	 * @param c
	 * @param d
	 */
	void search (String c,int d)
	{
		System.out.println("String and Integer Search");
	}
	
	int search (int d,String c)  //return type changed
	{
		System.out.println("Integer and String Search");
		return d;
	}
	
	public static void main(String[] args) {
		MethodoverloadingDefinition obj=new MethodoverloadingDefinition();
		obj.search(5);
		obj.search(5, 9);
		obj.search(5, "Vikrant");
		obj.search("Vikrant",5);
	}


}
