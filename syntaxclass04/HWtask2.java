package syntaxclass04;

import java.util.Scanner;

public class HWtask2 {

	public static void main (String []args) {
		//You are DMV representative and you need to ask customer their age
		//if they are 18 and older --issue a driver licence to them
		// otherwise - offer them to learning permit
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your age?");
		 double age = scan.nextDouble ();
		 
		 if (age >= 18) {
		
			 
			 System.out.println(" You  will issue a driver's licence.");
			 
			}else 
				System.out.println(" In your age we will  offer you to get a learners permit. ");
		
		
	}
	
	
	
}
