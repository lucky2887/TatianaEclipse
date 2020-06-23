package HW1;

import java.util.Scanner;

public class Hw351 {

	public static void main (String[] args ) {
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Do you need a loan?");
				
		boolean loan= myScanner.nextBoolean();
				
					
			if ( loan= true){
			{System.out.println("What is your credit score");
			int score =myScanner.nextInt();
							
			if (score < 600) {
				System.out.println("Not eligible");
			} else  if (score > 601 && score < 700) {
				System.out.println("Maybe eligible");
			} else if (score > 701 && score < 800) {
				System.out.println("Maybe eligible");
			} else (score >801) {
				System.out.println("Eligible");
			
	} else {
				System.out.println("Unknown");
			}
			}
			}
		}
}