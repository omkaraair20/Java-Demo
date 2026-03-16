package Strings;

import java.util.Scanner;

public class letter_twice {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter a string:");
          String input=sc.nextLine();
          
          String doubledString=doubleCharacters(input);
          System.out.println("Doubled characters:" +doubledString);
	}
	public static String doubleCharacters(String str) {
		StringBuilder doubled=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			doubled.append(ch).append(ch);
		}
		return doubled.toString();
	}

}
