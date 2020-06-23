package HWjira;

public class hw37 {

	
	public static void main (String[] args){
		System.out.println("Are you thirsty?");
		Scanner sc=new Scanner(System.in);
		boolean thirsty=sc.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy =sc.nextBoolean();
		String drink;
		 if ((thirsty) && (!sleepy)) {
		   drink="Water";
		 } else if ((thirsty) && (sleepy)){
		   drink="Coffee";
		 } else if ((!thirsty) && (sleepy)){
		   drink="Tea";
		 } else {

		   drink ="Nothing";
		 }
		   System.out.println(" Looks like you need to drink " + drink);
		 }
		   
		 
		}
}
