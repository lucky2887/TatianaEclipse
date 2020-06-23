package syntaxclass04;

import java.util.Scanner;

public class ScannerExDemo {
public static void main (String[] args) {
	// Capture  name from the user and print
	// YOu name is _________
	//Ask the user  enter the age print 
	// YOu name is ____and age is ____
	
	
	Scanner input = new  Scanner (System.in);
	
	System.out.println("Please enter your full name!" );
	String name = input.nextLine();
	System.out.println("Your name is " + name );
	
	System.out.println("Please enter your age as double!" );
			double albanianAge = input.nextDouble();
	System.out.println("Your name is "+ name + " and age is " + albanianAge );
	
}
}
