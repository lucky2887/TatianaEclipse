package com.syntax.class01;

public class PracticeVariables {

	public static void main(String[] args) {
		
		byte x= 5;  //range   -128 .. 127
		//test range -150,+228; range cannot be resolve to a variable,cannot covert from int to byte//
				
		short y = 30787;  //range -32,768 .. 32,767
		//test range 33,787;-33,896 ;invalid VariableDeclarator,//
		
		int z = 2147483647;   //32 bits	range 32 bits	-2,147,483,648 .. 2,147,483,647
		// test range -1147,483,64888. 3147,483,647;VariableDeclarator expected instead,
		//of type int is out of range 23434543654675
		
		
		long t =23435465l; 
		//  8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//test The literal 340395374805469586905l8899 of type int is out of range
		
		
		float u = 256f;
		// 4 bytes  approximately ±3.40282347E+38F (6-7 significant decimal digits)
		// test 345465476587687980967778889of type int is out of range
		
		
		double v = 14;
		//8 bytes 
		//test32456789033455678922344555656 type int is out of rang 
		
		char Class ='T';
		// single character  only
		
		boolean result =true; //only accepts true or false
		// test range true or false only
		
		System.out.println(x);
		
		System.out.println(y);
		
		System.out.println(z);
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
		System.out.println(Class);
		System.out.println(result);
		

	}

}
