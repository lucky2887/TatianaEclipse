package HWjira;

import java.util.Scanner;

public class hw43 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    System.out.println("Input a number between 1-12" );
	    int number=sc.nextInt();
	    String month;
	    switch (number){
	      case 1:
	      month = "January";
	      break;
	       case 2:
	      month = "February";
	      break;
	       case 3:
	      month = "March";
	      break;
	      case 4:
	       month = "Aprel";
	      break;
	      case 5:
	       month = "May";
	      break;
	      case 6:
	       month = "June";
	      break;
	      case 7:
	      month = "July";
	      break;
	      case 8:
	      month = "August";
	      break;
	      case 9:
	      month = "September";
	      break;
	      case 10:
	      month = "October";
	      break;
	      case 11:
	      month = "November";
	      break;
	      case 12:
	      month = "December";
	      break;
	      default:
	    	  System.out.println("Invalid" );
	    	  break;
	    }
	    System.out.println("month" ); 
	    
	      
	      
	      
	      
	      
	      
	      
	    }
			 
	    
	    
	  }
	}