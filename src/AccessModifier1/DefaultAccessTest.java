package AccessModifier1;

import AccessModifier2.DefaultAccessSource;

public class DefaultAccessTest {

public static void main(String[] args) {
	DefaultAccessSource obj=new DefaultAccessSource();
	//obj.defaultMethod();  // unable to access Default Method in Different Package
	obj.publicMethod();
	
	/**
	 * Only Public method is accessible from different package using other class Object
	 * We cannot access private, default and protected(with inheritance we can)
	 */
	
	
}
}

class DefaultAccessTest2 extends DefaultAccessSource
{
	public static void main(String[] args) {
		DefaultAccessTest2 obj1=new DefaultAccessTest2();
		obj1.publicMethod();
		obj1.protectedMethod();
		
		/**
		 * Using Inheritance and with Child Class object , we can access Public and Protected method
		 */
		
		/**
		 * Imp Default vs Protected : Default cannot be access from different package
		 * Protected can be accessed from different package
		 */
		
	}
}


