package HWjira;

import java.util.Scanner;

public class Hw41 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		 System.out.println("enter the age of the Child" );
		 
		 int age=sc.nextInt();
		 switch (age){
	     case 1:					 
		 System.out.println("You can Crawl" );
		 break;
		 case 2:
			 System.out.println("You can Talk" );
		 break;
		 case 3:
			 System.out.println("You can Dance" );
			 break;
		 case 4:
		 System.out.println("You can get  Trouble" );
		 break;
		 default:
			 System.out.println("I don't know how old you are" );
		 
		 }	 
	}

}
