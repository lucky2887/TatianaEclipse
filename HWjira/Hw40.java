package HWjira;

import java.util.Scanner;

public class Hw40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter name of the instructor" );
		 		 		 
				 String instructor=scanner.nextLine();
				 
				 
				     switch (instructor){
				     case "Shiva":					 
					 System.out.println("Will take care of Java Assignment" );
					 break;
					 case "Sandish":
						 System.out.println("Will take care of SDLC Assignment" );
						 break;
					 case "Weqas" :
						 System.out.println("Will take care of Selenium Assignment" );
						 break;
					 case "Asel":
						 System.out.println("Will take care of every Assignment" );
						 break;
					 default:
						 System.out.println("Invalid instructor selected" );
					 
				
				 
				 
	}

	}
}
