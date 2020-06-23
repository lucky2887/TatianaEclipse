package Syntaxclass05;

import java.util.Scanner;

public class Recap1 {

	public static void main(String[] args) {
     ///create a Java program that will ask if user has a credit card or not
		// if the user does not have a credit card then offer them
		//
		
		Scanner myScanner = new Scanner(System.in);
		boolean cc;
		
		System.out.println("Do you have a cresit card?9 true or false.");
		
		cc = scan.nexBoolean();
		 if (cc) {
			 System.out.println("What is your credit card balance?");
			 
			 
			 double balance = scan.nexDouble();
			 if (balance >= 1000) {
				 
				 System.out.println("Please pay off imediately.");
				 
			 }else {
				 System.out.println("You can spend more.");
			 }
			 
			 
		 }else {
		System.out.println("Do you want to apply for our best Credit Card!");
		
		
		
		 }
		
			
			
			
		
		

	

}
