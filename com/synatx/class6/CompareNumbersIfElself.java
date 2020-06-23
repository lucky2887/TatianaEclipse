package com.synatx.class6;

import java.util.Scanner;

public class CompareNumbersIfElself {
	
	
	
    public static void main(String[]args) {
    	Scanner scan =new Scanner 
    	System.out.println("Please enter teh first number");
    	double a = scan.nextDouble();
    	System.out.println("Please enter teh second number");
    	double b = scan.nextDouble();
    	System.out.println("Please enter teh second number");
    	double largest =0;
    	
    	//int a=5,b=9,c=1;
    	if (a>b &&  a>c) {
    		largest=a;
    	}else if (b> a && b>c) {
    		largest =b;
    	}else if (c>a &&c>c) {
    		largest=c;
    		System.out.println("Largest number is"  +largest );
    		
    		
    		
    	}
    }
}
