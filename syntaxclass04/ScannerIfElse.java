package syntaxclass04;

import java.util.Scanner;

public class ScannerIfElse {
	
	
	
	public static void main (String[] args ) {
		///command + shift+o
		//ctrl + shift + o
		Scanner scan = new Scanner (System.in);
		
		//Ask the user to enter two numbers
		// Compare the number and print which one is large
		
		
		
		System.out.println("Please enter a number!" );
		
		int num1= scan.nextInt(); 
		
		System.out.println("Please enter a number!" );
		int num2 = scan.nextInt(); 
				
			if (num1>num2) {	
		
		System.out.println("Number are " + num1 + " is large than" +num2);
				
	}else if (num1<num2){	
		System.out.println("Number are " + num1 + " is smaller than " +num2);
		
	}else  {	
			System.out.println( num1 + "is equal " +num2);	
		
	}	
	}
	}
