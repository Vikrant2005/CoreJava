package typecasting;
/**
 *  There are two type of type casting
 *  	1. Implicit
 *  	2. Explicit
 *  
 *  Implicit ->Widening Conversion->Upcasting- Smaller to Big Data Type=No Information loss-->Perform by Complier
 *  
 *  Explicit->Narrowing Conversion->Downcasting-Big to Smaller--Loss of Information==>Perform by Developer
 *  	
 * @author vikrant.upadhayay
 *
 */

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
		int i=100;
		int j='A';  //Upcasting ,Implicit smaller datat type to big data type
		
		System.out.println(i+" and "+j);
		
		double k=199.99;
		int l=(int)k;
		System.out.println(k+ " converted to "+l);//Explicit /Downcasting
				
		
}

}
