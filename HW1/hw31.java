package HW1;

import java.util.Scanner;

public class hw31 {
	public static void main ( String []args){
	    Scanner question =new Scanner(System.in);
	  boolean isSunny;
	  int Temp;
	  System.out.println("Is it sunny outside?true");
	  isSunny= question.nextBoolean();
	  if(isSunny) {
		  System.out.println("It is a sunny day,I should go somewhere!");
		  System.out.println("What is the temperature outside?");
		  Temp= question.nextInt();
		  if (Temp >85){
			  System.out.println("I am going to the beach");
		  }else{
			  System.out.println("I am going to the park");
		  }
	  }else {
		  System.out.println("I stay home and practice Java");
		  
		  
	  }
	  
	    
	  }
	  
	  }
	  

