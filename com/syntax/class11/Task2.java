package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		// create an array on integers
		//and calculate the sum of all elements in the array
		
		int [] numbers= {23,56,73,16,80,70,39};
		int sum=0;
		for (int num: numbers) {
		sum+=num;
		System.out.println("The sum of all numbers is :+ sum");
		System.out.println("--------------using for loop");
		
		int total =0;
		for (int i=0;i<numbers.length;i++){
		int num = numbers[i];
			 total += num;
			System.out.println("--------------using for loop");
			System.out.println("The tottal is numbers is:" + total);
		}
		}
	}

}
