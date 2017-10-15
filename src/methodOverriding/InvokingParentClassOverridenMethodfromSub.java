package methodOverriding;

/**
 * We can call parent class method in overriding method using super keyword.
 * @author vikrant.upadhayay
 *
 */

class Parent4
{
	void show()
	{
		System.out.println("Parent CLass");
	}
}

class Child4 extends Parent4
{
	void show()
	{	super.show();
		System.out.println("Child CLass");
	}
}

public class InvokingParentClassOverridenMethodfromSub {
	
	public static void main(String[] args) {
		Parent4 obj=new Child4();
		obj.show();
	}

}

//O/P
//Parent CLass
//Child CLass
