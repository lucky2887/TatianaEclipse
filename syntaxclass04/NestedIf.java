package syntaxclass04;

public class NestedIf {
public static void main (String[] args) {
	
	
	boolean isMorning =false;
	boolean isSchool = false;
	int time =20;// 8 p.m.
	
	if (isMorning) {
		System.out.println("Good morning!");
		
		
		if (isSchool) {
			System.out.println("Friends");
		}else {
			System.out.println("Family");
			System.out.println("Buy!");
		}
			
		} else {
			System.out.println("It is not morning");
			if (time<18) {
			System.out.println("Good afternoon");
		} else {
			System.out.println("Good evening!");
		}	
		}
		System.out.println("Victoria has noquestions");
	}
	
	
	
}

