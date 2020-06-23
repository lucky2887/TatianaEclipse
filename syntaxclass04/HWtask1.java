package syntaxclass04;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class HWtask1 {
	public static void main (String []args) { 
		
		
		// You are a loan specialist and you need to ask user what amount of loan is needed
		// if less or equal to 200,000 then you lend the money
		// otherwise - reject 
		
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What amount of money do you need");
		 double amount = scan.nextDouble ();
		 
		 if (amount <= 200000) {
				
		 
		 System.out.println(" Your loan request is  approved");
		 
	}else 
		System.out.println(" Sorry,your loan request is declined ");
		
	}
}
