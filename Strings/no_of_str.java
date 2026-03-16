package Strings;

import java.util.Scanner;

public class no_of_str {

	public static void main(String[] args) {
		 System.out.println("Enter the String:");
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int count=1;
         
         for(int i=0;i<s.length()-1;i++) {
        	 if((s.charAt(i)==' ') && (s.charAt(i + 1) != ' ')) {
        		 count++;
        	 }
         }
         System.out.println("Numbers of words in a string:" +count);
	}

}
