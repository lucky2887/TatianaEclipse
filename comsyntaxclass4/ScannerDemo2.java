package comsyntaxclass4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		System.out.println("Please enter your age:");

		
		
		
		Scanner scanner =new Scanner(System.in);
		
		
		int age =scanner.nextInt();
		
		
		
		if (age>=18) {
			System.out.println("You can drive in US");
		}else{
			System.out.println("You need to grow up");
			
		}
	}
	

}
