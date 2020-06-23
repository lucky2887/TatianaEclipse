package syntaxclass04;

public class NestingElself {

	public static void main(String[] args) {
		
		
		
		boolean quiz = true;
		int score= 82;
		
		
		
		
		if (quiz = true) {
			System.out.println("We will check the score");
			
			if (score >=90) {
				System.out.println("A,Great job!");
			}
				if (score >=80) {
					System.out.println("B,Well done!");
				}
					if (score >=70) {
						System.out.println("C,Just pssed!");
					}
					}else {
						System.out.println("F, Yu failed!");
					}
			
		} else {
			System.out.println("Please finish your quize");
			

	}

}
