package collection;
/**
 * Purpose of Constructor:
 * 	1. Object Creation
 * 	2. Initializing Instance variable
 * @author vikrant.upadhayay
 *
 */
public class InitializeInstanceVariableByConstructor {
	
	int empid;   //Global Variable
	String empname;  //Instance variable
	String empdesignation;
	
	InitializeInstanceVariableByConstructor(int empid,String empname,String empdesignation) //local Variable
	{
		this.empid=empid; //"this" keyword will refer to instance variable in case names are same
		this.empname=empname;
		this.empdesignation=empdesignation;
	}
	
	public static void main(String[] args) {
		InitializeInstanceVariableByConstructor obj=new InitializeInstanceVariableByConstructor(1055,"Vikrant","Team Lead");
		System.out.println("Employee Id: "+ obj.empid+"\n"+"Emp Name: "+obj.empname+"\n"+"Emp Designation: "+obj.empdesignation);
	}
	

}
