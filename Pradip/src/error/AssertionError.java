package error;

import java.util.Scanner;

public class AssertionError {
	
	public static void main(String []args) {
		
		@SuppressWarnings("resource")
		Scanner scn =new Scanner (System.in);
		System.out.println( "Enter marks");
		int input =scn.nextInt();
		assert input <=40 :"failed";
		System.out.println( "marks is"+input);
	}

}
