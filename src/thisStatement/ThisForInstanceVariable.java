/**
 * This() used in case of Instance/Global variable and local variable names are same.
 */
package thisStatement;

class Employee1
{
	int empid;
	String empname;
	
	public void recordUpdate(int empid,String empname)
	{
		this.empid=empid;  //current class +instance variable assignment
		this.empname=empname;
	}
	
public void Display()
{
	System.out.println("Emp name is :"+empname+"\n"+"Emp id :"+empid); 
}
}

public class ThisForInstanceVariable {
	
public static void main(String[] args) {
	
	Employee1 obj=new Employee1();
	obj.recordUpdate(7, "Vikrant");
	obj.Display();
	
}

}
