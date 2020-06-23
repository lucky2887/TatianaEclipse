package HW1;

import java.util.Scanner;

public class Hw22 {

	
	public static void main (String[] args ) {
	    
	  	Scanner myScanner = new Scanner (System.in);
	 System.out.println("Enter your name" );
	 String name=myScanner.nextLine();
	 
	 System.out.println("Enter our mobile number (please use xxx-xxx-xxxx format)" );
	 String mobileNumber = myScanner.nextLine();
		
	 System.out.println("Enter your age" );
	 
		    
	    int age = myScanner.nextInt();
	    System.out.println(" Your name is " + name+ ", your age is " + age+ 
	            "and your mobile number is " + mobileNumber);
	 
	}
}
