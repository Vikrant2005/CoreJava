package Constructor;

  class Alpha {

	Alpha()
	{System.out.println("Alpha");}  // Non Parametrised Constructor have Super Keyword by default
	
}

class Beta extends Alpha {

	Beta()
	{System.out.println("Beta");} //Default Super
	
}

class Gama extends Beta {

	Gama()
	{System.out.println("Gama");} //Default Super
	
	public static void main(String[] args) {
		Gama obj=new Gama();
	}
	
}

public class DefaultSuperinConstructor
{
	public static void main(String[] args) {
		Gama obj=new Gama();
		
	}
}


/* Output:
 Alpha
 Beta
 Gama*/

