package HWjira;

import java.util.Scanner;

public class HW35 {

	
	public static void main (String[] args ) {
		  Scanner myScanner = new Scanner (System.in);
				System.out.println("Do you need a loan?");
				boolean loan= myScanner.nextBoolean();
				String eligible= "";
				if (loan=true){
							System.out.println("What is your credit score");
					int score =myScanner.nextInt();
								if (score < 600)eligibile ;
					}else  if(score > 601 && score < 700)eligibile {
						System.out.println("Maybe eligible");
					}else if(score > 701 && score < 800)eligibile {
						System.out.println("Maybe eligible");
					}else  {
						System.out.println("Eligible");
					
			}else {
						System.out.println("Unknown");
					}
		}
					


}
