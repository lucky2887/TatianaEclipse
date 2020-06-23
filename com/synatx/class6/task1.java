package com.synatx.class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		///Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
        String country=scan.next();
        String language;
        
		
		
		switch(country) {
		case "Russia":
		language = "Russian";
		break;
		case "Spain":
		language= "Spanish";
		break;
		case "Pery":
		language= "Aymara";
		break;
		default:
			language ="Unknown";
		}
		System.out.println("Your language is"  +language );
		
		
	}
	}

