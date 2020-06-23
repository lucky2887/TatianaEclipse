package com.synatx.class6;

public class Recap1 {

	
	
	public class Recap {
		public static void main (String []args) {
			
			
			
			//if hour is between 1-11--morning
			//if hour is between 12-15--morning
			//if hour is between 16-20--morning
			//if hour is between 21-24--morning
			//We will print:Right now _____


			
			
			int hour=35;
			String dayTime;
				
				if (hour>=1 &&hour <=11) {
					dayTime ="morning";
				}else if (hour>=12 &&hour <=15) {
					dayTime ="afternoon";
				}else if (hour>=16 &&hour <=20) {
					dayTime ="evening";
				}else if (hour>=21 &&hour <=24) {
					dayTime ="night";
					if (dayTime.equals("unknown")) {
				}else {
					System.out.println("Right now it is" + dayTime);
					//if is it unknow I don't want to print anything
					if (!dayTime.contentEquals("Unknown")) {
						System.out.println("Right now it is "+dayTime);
						
					}
				}
		}
			
			
		}


