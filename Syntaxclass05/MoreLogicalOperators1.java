package Syntaxclass05;

import java.util.Scanner;

public class MoreLogicalOperators1 {

	public static void main(String [] args ) {
		
						
		// Take the age age from the user and then print
		// if age is between 0-3----you are a baby
		// if age is between 4-5----you are a kid
		// if age is between 6-12----you are a child
		// if age is between 13-19----you are a teenager
		// if age is between 20-64----you are a adult
		// if age is more than or equal to 65 ---Enjoy life
		
		Scanner scan = new Scanner (System.in);
		
        int age = 5;
		int age1 =scan.nextInt();
		
		if (age1 >= 0 && age1 <= 3) {
			System.out.println ("You are a baby");
		}else if (age1 >4 && age1 <=5) {
			System.out.println("You are kid");
		}else if (age1 >6 && age1 <=12 ) {
			System.out.println("You are a child");
		}else if (age1 >13 && age1 <=19 ) {
			System.out.println("You are a teenager");
			
		}else if (age1 >20 && age1 <=64 ) {
			System.out.println("you are a adult");
		}else if (age1 >65 ) {
			System.out.println("Enjoy life");
			
		}else  {
			System.out.println("That wasn't a correct age");
		
		
	}
	
	
	
	
}
