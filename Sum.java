// Java programs to calculate the sum of digits of a number

public class Sum {

	public static void main(String[] args) {
		int number=12345;
		int sumofdigits=calculateSumOfDigits(number);
		System.out.println(" Sum of digits of " + number + " is: " + sumofdigits);
	}

	public static int calculateSumOfDigits(int number) {
		int sum=0;
		while(number>0) {
			int digit=number % 10;
			sum=sum+digit;
			number=number/10;
		}
		return sum;
	}

}
