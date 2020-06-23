package HWjira;

import java.util.Scanner;

public class hw42 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the roll number of the Child" );
		
		int number=sc.nextInt();
		 switch (number){
		 case 101:					 
			 System.out.println("Student name: Ramesh" );
			 break;
			 case 102:
				 System.out.println("Student name: Mahesh " );
				 break;
			 case 103:
				 System.out.println("SStudent name: Mukesh  " );
				 break;
			 default:
				 System.out.println("Not found Student name: in Class" );
				 
				 
		 }
		
		
		
		
		
		

	}

}
