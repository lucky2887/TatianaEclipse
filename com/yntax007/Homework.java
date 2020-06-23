package com.yntax007;

public class Homework {
	
	
	
public static void main (String[] args) {
	//print numbers from 1000 to 1
	for (int i=100;i >=1; i--) {
		
		
		System.out.println(i);//step3
		
		
		//System.out.println( "print numbers 1,2,3.____"_);
		
		//for(int i =1; i<=3;i++) {
		//	int j == 1;//comparison operator//
			
		
		System.out.println("--Print odd numbers between 20 and 50(");
		for (int i = 20; i<=50; i++) {
			//if it is odd
			if (i%2 ==1) {
			System.out.println(i);
			
			System.out.println("--Print odd numbers between 20 and 50(");// second way
			for (int i = 21; i<=50; i+=2) {
				System.out.println(i);
			}
		}
		}
	
	
	}
	
	
}
	
