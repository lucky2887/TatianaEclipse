package HWjira;

import java.util.Scanner;

public class hw351 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    boolean answer = scanner.nextBoolean();
	    if(answer){
	      System.out.println("What is your credit score");
	      int creditScore = scanner.nextInt();
	      if(creditScore < 600){
	        String notEligible = "Not eligible";
	        System.out.println("The eligibility is " + notEligible);
	      }else if(creditScore >= 600 && creditScore <= 700){
	        String maybe = "Maybe eligible";
	        System.out.println("The eligibility is " + maybe);
	      }else if(creditScore >= 701 && creditScore <= 800){
	        String eligible = "Eligible";
	        System.out.println("The eligibility is " + eligible);
	      }else if(creditScore > 800){
	        String define = "Definitely eligible";
	        System.out.println("The eligibility is " + define);
	      }
	    }else {
	      String unknown = "Unknown";
	      System.out.println("The eligibility is " + unknown);
	    }
}
}