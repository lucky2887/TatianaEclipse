package HWjira;

import java.util.Scanner;

public class HW39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int largest = 0;
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		System.out.println(" The largest number " + largest);

	}

}
