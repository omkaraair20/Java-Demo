package Strings;

import java.util.Scanner;

public class even_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
        String input=sc.nextLine();
        
        System.out.println("Even indexed characters in \"" + input + "\":");
        printEvenIndexedCharacters(input);
	}
	
	public static void printEvenIndexedCharacters(String str) {
		for(int i=0;i<str.length();i++) {
			if(i%2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
