/**
 * Static Methods can be Overloaded
 * 
 * Since Static method can be overloaded Main can be overloaded.
 * 
 */
package Methodoverloading;

public class MethodOverloadingStaticMethod {
	
	static void sum (int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sum (int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		MethodOverloadingStaticMethod.sum(5, 10);
		MethodOverloadingStaticMethod.sum(100, 200, 300);
	}

}
