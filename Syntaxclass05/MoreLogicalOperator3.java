package Syntaxclass05;

import java.util.Scanner;

public class MoreLogicalOperator3 {

	
		public static void main(String[] args) {
			
			///Prompt the user to enter person heights in inches. Person should be classified as one of the following:
			//• short (under 60 inch)
			//• medium(between 60 -72 inch)
			///• tall (over 72 inch)
			
			System.out.println("Please, enter your height in inches");
			Scanner input = new Scanner(System.in);
			
			
			
			
			
			
	       double personHeight = input.nextDouble();
	 
			
			if (personHeight < 60 ){
				System.out.println("Your hieght is  short");
			}else if (personHeight >60 && personHeight <=72 ) {
				System.out.println("You hieght is  medium");
			}else if (personHeight>72) {
				System.out.println("Yuo hieght is  tall");
	}
		}
}
