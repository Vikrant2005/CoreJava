/**
 * Accessing Properties /Members of Super Class by using "extends" keyword is inheritance
 * 
 * Super Class to Sub Class
 * It is also called as  "Is-A" Relationship /Generalization
 * 
 * in this Program we access Static and Non Static Variable and Meethod of Super Class using Child Object
 * 
 * Is is used for Reusability, Reduction of Code,improved performance
 * 
 * Object class is super class of every class
 */
package Inheritance;

public class InheritanceDefinition extends SuperClassforPrograms {

	
	public static void main(String[] args) {
		InheritanceDefinition obj=new InheritanceDefinition();
		System.out.println(obj.i);
		System.out.println(j);
		obj.Hero();
		Fly();
	}
}

/**
O/p:
10
20
I am Super Hero
I can Fly
*/

