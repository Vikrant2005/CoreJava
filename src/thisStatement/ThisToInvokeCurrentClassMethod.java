package thisStatement;

/**
 * Using ‘this’ keyword to invoke current class method
 * @author vikrant.upadhayay
 *
 */

public class ThisToInvokeCurrentClassMethod {
	
	ThisToInvokeCurrentClassMethod()  //1st way is using constructor
	{
		this.show();
	}
	
	void display()  ///2nd way to create a method and call by obj.Methodname
	{
		this.show();
	}
	
	
	
	void show()
	{
		System.out.println(" Iam called by this");
	}
	
	public static void main(String[] args) {
		ThisToInvokeCurrentClassMethod obj=new ThisToInvokeCurrentClassMethod();
		obj.display();
	}

}
