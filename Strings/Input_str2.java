package Strings;

import java.util.Scanner;

public class Input_str2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		System.out.println("Original String is:"+input);
		separateAlphaAndNumeric(input);
	}
	
	public static void separateAlphaAndNumeric(String input) {
		StringBuilder alphaPart=new StringBuilder();
		StringBuilder numericPart=new StringBuilder();
		
		for(char ch:input.toCharArray()) {
			if(Character.isLetter(ch)) {
				
			}
			else if(Character.isDigit(ch)) {
				
			}
			alphaPart.append(ch);
			numericPart.append(ch);
		}
		System.out.println("Output in Alpha:"+alphaPart.toString());
		System.out.println("Output in Numeric:"+numericPart.toString());
	}

}
