package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
		char[]letters =new char[4];
		
		letters[0] = 'A';
		letters[0] = 'B';
				letters[0] = 'G';
				letters[0] = 'Z';
				System.out.println("printing before re-assigning" + letters [2]);
		//re-assigning
				letters[2] = 'K';
		
		System.out.println("printing after re-assigning" + letters [2]);
		

	}

}
