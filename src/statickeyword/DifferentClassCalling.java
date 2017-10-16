package statickeyword;

/**
 * Static and Nonstatic members calling within and across different class
 * 
 * Static belongs to class, are available on Class Loading
 * Non Static belongs to object , object have the copy of non static members of class
 *  
 * @author vikrant.upadhayay
 *
 */

class CalledMethod
{
	String name="Vikrant";
	static String company="Accenture";
	
	void m1()
	{
		System.out.println("m1()");
	}
	
	static void m2()
	{
		System.out.println("m2()");
	}
	
}

public class DifferentClassCalling {
	String name="Swela";
	static String companyinside="IBM";
	
	void m3()
	{
		System.out.println("m3()");
	}
	
	static void m4()
	{
		System.out.println("m4()");
	}
	
	public static void main(String[] args) {
		System.out.println("Accessing static Inside the class");
		m4();
		System.out.println(companyinside);
		System.out.println(DifferentClassCalling.companyinside);
		System.out.println("==========================================");
		System.out.println("Accessing static Outside the class");
		CalledMethod.m2();  //called by ClassName only 
		System.out.println(CalledMethod.company);
		System.out.println("==========================================");
		System.out.println("Accessing Non static Inside the class");
		DifferentClassCalling obj=new DifferentClassCalling();
		obj.m3();
		System.out.println(obj.name);
		System.out.println("==========================================");
		System.out.println("Accessing Non static Outside the class");
		CalledMethod obj2=new CalledMethod();
		obj2.m1();
		System.out.println(obj2.name);
		

		
		
	}

}
