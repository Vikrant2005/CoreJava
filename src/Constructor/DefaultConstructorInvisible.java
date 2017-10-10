package Constructor;
/**
 * Default constructor is created by Compiler and used during Object creation
 * 
 * We create Object of Constructor not Class
 * 
 * @author vikrant.upadhayay
 *
 */
public class DefaultConstructorInvisible {
	
	DefaultConstructorInvisible(int a)
	{
		
	}
	
	public static void main(String[] args) {
		DefaultConstructorInvisible obj=new DefaultConstructorInvisible(5);
		//DefaultConstructorInvisible obj2=new DefaultConstructorInvisible(); //this is is because we 
		//have User Defined constructor
	}

}
