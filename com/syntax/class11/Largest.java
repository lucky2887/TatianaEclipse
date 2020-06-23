package com.syntax.class11;

public class Largest {

	
	public static void main(String[] args) {
		// Countries
		
		String[] countries= {"Tajikistan", "Brazil", "Gambia", "USA"};
		
		for (String country: countries) {
			if (country.contentEquals("Albania")) {
				System.out.println("Tirania");
			}else if (country.contentEquals("Brazil")) {
					System.out.println("Brasilia");
			}else if (country.contentEquals("USA")) {
				System.out.println("Washington");
			}else {
				System.out.println(" The country " + country + "is not in my list.");
			
				for (int i=0;i< countries.length;i++) {
				switch (countries[i]) {
				case "Tajikistan":
					System.out.println(" Dushanbe ");
					break;
				case "Brazil":
					System.out.println(" Brasilia ");
					break;
					default:
					System.out.println(" The country " + country + "is not in my list.");
					
					
					
			
					
					
				
				}
				
				}
				
			}
		}
	}
}
