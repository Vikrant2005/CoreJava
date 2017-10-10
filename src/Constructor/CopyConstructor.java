package Constructor;

class Complex
{ 	int id;
	String name;

	Complex(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Complex(Complex c)
	{
		System.out.println("This is Constructor Copy");
		id=c.id;
		name=c.name;
	}
	
	public String toString()
	{
		return("Id :"+id+"\n"+"Name :"+name);
	}
}

public class CopyConstructor {
	
public static void main(String[] args) {
	Complex c1=new Complex(10,"Vikrant");
	Complex c2=new Complex(c1);
	System.out.println(c2);
}

}
