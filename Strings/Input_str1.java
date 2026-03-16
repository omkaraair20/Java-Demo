package Strings;

import java.util.Scanner;

public class Input_str1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		System.out.println("Original String is:"+ input);
        separateCharacters(input);
	}
	
	public static void separateCharacters(String input) {
		StringBuilder lowerCase=new StringBuilder();
		StringBuilder upperCase=new StringBuilder();
		
		for(char ch:input.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				
			}
			else {
				
			}
			upperCase.append(ch);
		}
		System.out.println("Output in lowercase:"+lowerCase);
		System.out.println("Output in uppercase:"+upperCase);
	}

}
