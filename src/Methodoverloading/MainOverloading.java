/**
 * Example of Static Method Overloading
 * 
 * main Overloading is Possible
 * 
 * Compile time Polyphormism
 * 
 * Java does not support Overloaded Variables
 */
package Methodoverloading;

public class MainOverloading {

	public static void main(String[] args) {
	System.out.println("From Main");
	MainOverloading.main("Vikrant");

	}
	
	public static void main(String arg1) {
		System.out.println("From Main with one arg");
		MainOverloading.main("Vikrant","Swela");

	}
	
	public static void main(String arg1,String arg2) {
		System.out.println("From Main with 2 arg");
	

	}

}
