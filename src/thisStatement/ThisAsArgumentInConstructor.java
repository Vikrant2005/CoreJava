package thisStatement;

class A

{	ThisAsArgumentInConstructor obj2; //Object kind of Instance variable

	A(ThisAsArgumentInConstructor obj2) //as we pass local variable with same name as instance
	{
		this.obj2=obj2;
		obj2.dispaly();
	}
}

public class ThisAsArgumentInConstructor {
	
	int x=5;
	
	ThisAsArgumentInConstructor()
	{
		A a=new A(this);
	}
	
	 void dispaly()
	 {
		 	System.out.println("Value of X in class ThisAsArgumentInConstructor="+x);
	 }
	
	public static void main(String[] args) {
		
		ThisAsArgumentInConstructor obj=new ThisAsArgumentInConstructor();
		
		
	}

}
