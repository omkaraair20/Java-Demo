package Strings;

import java.util.HashSet;

public class longest {

	public static void main(String[] args) {
		String s1="abcabcbb";
		String s2="bbbbb";
        String s3="pwwkew";
        String s4="";
        
        System.out.println("Longest substring without repeating characters in s1:" + lengthOfLongestSubstring(s1));
        System.out.println("Longest substring without repeating characters in s2:" + lengthOfLongestSubstring(s2));
        System.out.println("Longest substring without repeating characters in s3:" + lengthOfLongestSubstring(s3));
        System.out.println("Longest substring without repeating characters in s4:" + lengthOfLongestSubstring(s4));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set=new HashSet<>();
		int maxLength=0;
		int start=0;
		int end=0;
		
		while(end<s.length()) {
			char currentChar=s.charAt(end);
			if(!set.contains(currentChar)) {
				set.add(currentChar);
				maxLength=Math.max(maxLength, end-start+1);
				end++;
			}else {
				set.remove(s.charAt(start));
				start++;
			}
		}
		return maxLength;
	}

}
