package HWjira;

import java.util.Scanner;

public class HW38 {
	 
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		  
		  System.out.println("Please enter valid mark");
		  		  int mark= sc.nextInt();
		  		  char grade;
		  		  if ((mark<=1) && (mark>=25)){
		  		    grade = ('F');
		  		  } else if ((mark< 25) && (mark >= 45)){ 
		  		      grade = 'E';
		  		    }else if ((mark< 45 ) && (mark<= 50)){ 
		  		      grade = 'D';  
		  		     } else  if ((mark< 50) && (mark <= 60)){ 
		  		      grade = 'C';
		  		     } else  if ((mark< 60) && (mark<= 80)){
		  		       grade = 'B';
		  		     } else if (mark >80){
		  		         grade = 'A';
		  		         System.out.println("Your grade is " + grade);
		  		   
		  		       System.out.println("Please enter your mark");
		  		         
		  		       
		  		  
}

		  		  }

	}
