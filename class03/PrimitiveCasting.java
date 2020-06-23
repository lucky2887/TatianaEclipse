package class03;

public class PrimitiveCasting {

	
	public static void main (String [] args) {
		//widening smal in big
		
		double d=7;
		System.out.println(d);
		
		//int i = 7.58; //compile time error---type mismatch; cannot convert from double to int
		// narrowing casting , manually
		int i= (int) 7.58;
		//narrowing a large number into a byte
		//explicitly doing it,manually
		byte b=(byte) 123865;
		System.out.println (b);
		
		
		long l1 =45;
		long l2 = 235346547l;
		
		
		int number = (int)l2;
		System.out.println(number);
		
		
		
	}
}
