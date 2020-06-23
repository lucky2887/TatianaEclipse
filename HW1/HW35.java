package HW1;

import java.util.Scanner;

public class HW35 {

	public static void main (String[] args ) {
	
	Scanner myScanner = new Scanner (System.in);
	
	System.out.println("Do you need a loan?");
	boolean loan= myScanner.nextBoolean();
	String eligibility;
	
	if (loan) {
		System.out.println("What is your credit score?");
		int score= myScanner.nextInt();
		
		if (score < 600)eligibility = "Not eligible";
		if (score > 601 && score <700)eligibility="Maybe eligible";
		if (score > 701 && score <800)eligibility= "Eligible";
		if (score > 801)eligibility = "Definitely eligible" ;
		
	}
	else {
		System.out.println("Unknown");
		
		
		
		
	}
	


	
	
	}	
	
}
