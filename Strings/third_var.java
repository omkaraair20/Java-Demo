package Strings;

import java.util.Scanner;

public class third_var {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter first string:");
        String str1=sc.nextLine();
        
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        
        System.out.println("Before swapping : str1=" + str1 + ",str2=" + str2);
        
        str1=str1+str2;
        
        str2=str1.substring(0,str1.length()-str2.length());
        
        str1=str1.substring(str2.length());
        
        System.out.println("After swapping : str1=" + str1 + ",str2" + str2);
	}

}
