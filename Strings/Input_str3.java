package Strings;

public class Input_str3 {

	public static void main(String[] args) {
		String input="32400121200";
		String output=rearrangeDigits(input);
        System.out.println("Output:"+output);
	}
	
	public static String rearrangeDigits(String input) {
		StringBuilder digits=new StringBuilder();
		StringBuilder nonDigits=new StringBuilder();
		
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				digits.append(c);
			}else {
				nonDigits.append(c);
			}
		}
		return digits.toString() + nonDigits.toString();
	}

}
