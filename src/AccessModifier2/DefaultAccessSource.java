package AccessModifier2;

/**
 * If other programmers use your class, try to use the most restrictive access level that makes sense for a particular member.
 * Use private unless you have a good reason not to.
 * Avoid public fields except for constants.
 * @author vikrant.upadhayay
 *
 */
 public class DefaultAccessSource  {
	
	void defaultMethod()
	{
		System.out.println("Default Method Accessed");
	}
	
	public void publicMethod()
	{
		System.out.println("Public Method Accessed");
	}
	
	private void privateMethod()
	{
		System.out.println("Private Method Accessed");
	}
	
	protected void protectedMethod()
	{
		System.out.println("Protected Method Accessed");
	}

	public  static void main(String[] args) {
		System.out.println(" Accessing method within Class");
		DefaultAccessSource obj=new DefaultAccessSource();
		obj.privateMethod();
		obj.publicMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		
		/**
		 * Method with all Access Modifier can be accessed within class
		 */
	}
 }

 
