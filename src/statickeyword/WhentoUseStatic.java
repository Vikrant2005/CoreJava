package statickeyword;

/**
 * Use Static variable for the property that is common to all Object
 * 
 * Static methods for changing Static Variables
 * 
 * @author vikrant.upadhayay
 *
 */

public class WhentoUseStatic {
	
	static String company; // company name  for all Employee same
	String empname;
	
static void setCompany(String name)
{
	company=name;
	System.out.println(company);
}

public static void main(String[] args) {
	//In Case of non static method to initialize static member
	//WhentoUseStatic obj=new WhentoUseStatic();  We need to create Object to access Static Member Initialization
	//Object creation means extra memory low performance
	//obj.setCompany("Accenture");
	
	//In case of static method to Update static variable
	
	setCompany("Accenture");
	
}

}
