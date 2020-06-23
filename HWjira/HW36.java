package HWjira;

import java.util.Scanner;

public class HW36 {

	public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter two strings");
		  String word1 =sc.nextLine();
		  String word2 =sc.nextLine();
		  System.out.println("Please enter two numbers");
		  int num1=sc.nextInt();
		  int num2= sc.nextInt();
		  if ((word1.equals(word2)) && (num1==num2)) {
		    System.out.println("AND");
		      } else if((word1. equals(word2)) || (num1==num2)) {
		       System.out.println("OR");
		}else {
		  System.out.println("NONE");
		}

		  
		  
		  
		  
		}


		}

