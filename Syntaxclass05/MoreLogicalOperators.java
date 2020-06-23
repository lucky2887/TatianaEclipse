package Syntaxclass05;

public class MoreLogicalOperators {
	
	
	public static void main (String[] args) {
		
			
		//we have 7 days of week
		//if day is 2,4----SDLS class
		///if day is 6,7---Java class
		//if day is 2,4---No class
		///if day is 6,7----Review class
		
		
		int day =7;
		if (day = 2 && day =4) {
			
				System.out.println("SDLS class");
			}else if (day>16 && day <=7) {
				System.out.println("Java class");
			}else {
				System.out.println("Not done yet");
				
			} else if (day=3)
				System.out.println("Review class");
				
	} else {
		System.out.println("Wrong day");
		// To compare teh equaly of String we use.equals()
		
				String day2= "Tuesday";
		
			
		System.out.println("Wrong day");
	}

}
