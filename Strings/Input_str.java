package Strings;

import java.util.Scanner;

public class Input_str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		
		String output=getCharacterCount(input);
		System.out.println("Output:"+output);
	}
    
	public static String getCharacterCount(String str) {
		StringBuilder result=new StringBuilder();
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				result.append(str.charAt(i)).append(count);
			}
		}
		return result.toString();
	}
}
