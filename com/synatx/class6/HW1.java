package com.synatx.class6;

import java.util.Scanner;

public class HW1 {

	
	public static void main (String [] args) {
		
		//Write a program for user to enter his /her birth month
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter your birth month:");
			String month =scan.next();
		String season= "Unknown";
		if (month.equals("December") ||month.equals("January")||month.equals("February")) {
			season= "Winter";
			
		}else if (month.equals("December") ||month.equals("January")||month.equals("February")) {
			season="Summer";
			
		}else if (month.equals("March") ||month.equals("April")||month.equals("May")) {
			season ="Spring";
		}else if (month.equals("June") ||month.equals("July")||month.equals("August")) {
			season="Summer";
		}else {
			season="Unknown";
			
		}
		System.out.println("You were born in" +season);
		
	}
	
	
	
	
}
