package com.synatx.class6;

public class Recap {
public static void main (String []args) {
	
	
	
	//if hour is between 1-11--morning
	//if hour is between 12-15--morning
	//if hour is between 16-20--morning
	//if hour is between 21-24--morning
	//We will print:Right now _____


	
	
	int hour=13;
	if (hour >=1 && hour <=11)
	
		
		if (hour>=1 &&hour <=11) {
			System.out.println("Right now it is morning ");
		}else if (hour>=12 &&hour <=15) {
			System.out.println("Right now it is afternoon ");
		}else if (hour>=16 &&hour <=20) {
			System.out.println("Right now it is evening ");
		}else if (hour>=21 &&hour <=24) {
			System.out.println("Right now it is night ");
		}else {
			System.out.println("Unknown ");
			
		}
}
	
	
}
