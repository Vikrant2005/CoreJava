package thisStatement;

/**
 * Using ‘this’ keyword as method parameter
 * @author vikrant.upadhayay
 *
 */

public class ThisAsMethodParameter {
	
	int a;
	int b;
	
	ThisAsMethodParameter()
	{
		a=10;
		b=10;
	}
	
	void get ()
	{
		display(this);  //this =new ThisAsMethodParameter();
	}
	
	void display(ThisAsMethodParameter obj1)
	{	System.out.println(obj1);   //HashCode // or Stack Reference
		System.out.println("a="+a+"\n"+"b="+b); // Covert object reference to String or Override to String and Unbox
	}
	
	public static void main(String[] args) {
		ThisAsMethodParameter obj=new ThisAsMethodParameter();
		obj.get();
	}

}
