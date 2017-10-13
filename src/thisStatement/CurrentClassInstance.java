package thisStatement;
/**
 * Using ‘this’ keyword to return the current class instance
 * @author vikrant.upadhayay
 *
 */
public class CurrentClassInstance {
	
	int a;
	int b;
	
	CurrentClassInstance()
	{
		a=10;
		b=20;
	}
	
	CurrentClassInstance get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a="+a+"\n"+"b="+b);
	}
	
	public static void main(String[] args) {
		CurrentClassInstance obj=new CurrentClassInstance();
		obj.get().display();
	}

}
