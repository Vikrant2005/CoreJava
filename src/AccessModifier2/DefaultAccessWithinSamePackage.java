package AccessModifier2;

public class DefaultAccessWithinSamePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultAccessSource obj4 = new DefaultAccessSource();
		System.out.println(" Accessing method outside Class");
		obj4.defaultMethod();
		obj4.protectedMethod();
		obj4.publicMethod();

		// Cannot Access Private method from different class within same Package
	}

}

