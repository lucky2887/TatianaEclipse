package Syntaxclass05;

public class LogicalAnd {

	
	
	public static void main (String[] args) {
		
		
		
		
		
		// Declare is between 1-10-----number is small
		// Declare is between 11-100-----number is big
		// Declare is between 101-1001-----number is large
		
		int num = 5;
		
		if (num >= 1 && num <= 10) {
			System.out.println(num +"is a small number");
		}else if (num>10 && num <=100 ) {
			System.out.println(num +"is a medium number");
		}else if (num>100 && num <=1000 ) {
			System.out.println(num +"is a large number");
		}else {
			
			System.out.println(num +"is extra large");
		}
		
		
	}
}
