package HWjira;

import java.util.Scanner;

public class scanner1 {



	  public static void main (String [] args){
		  
	  
	    Scanner myscan = new Scanner(System.in);
	    
	    System.out.println("Please Enter First Name:" );
	    String firstname = myscan.nextLine();
	    
	     System.out.println("Please Enter Surname");
	    String surname = myscan.nextLine();
	    
		

	    
	    System.out.println(firstname + " "  +surname);
	  
	  }
	    
}