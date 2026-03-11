// Java program to find fibonacci series upto a given number range

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of terms");
		
		int number=6;
		int first=0, second=1, next;
		System.out.println("Fibonacci series is");
		
		for(int i=0;i<=number;i++) {
			System.out.println(first+"");
			next=second+first;
			first=second;
			second=next;
		}

	}

}
