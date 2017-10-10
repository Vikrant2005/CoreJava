/**
 * Method Overloading accept Parametrs as Object ,in that case passinfg Null , may create ambiguity 
 * 
 * Throw compile time error : Ambiguity , compiler is confused which method needs to be called
 */
package Methodoverloading;

public class MoAndNullError {
	
	void search (String s)
	{
		System.out.println(s);
	}
	
	void search (Integer i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoAndNullError obj=new MoAndNullError();
		//obj.search(null); //ambiguos compile time Error
		
	}

}
