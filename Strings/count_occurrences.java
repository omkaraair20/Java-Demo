package Strings;

import java.util.HashMap;

public class count_occurrences {

	public static void main(String[] args) {
		 CharacterCount("Test Automation Java Automation");
    }
	static void CharacterCount(String inputString) {
		HashMap<String,Integer> charCountMap=new HashMap<>();
	 
		for(String s:inputString.split(" ")) {
		     if(charCountMap.containsKey(s)) {
		     }
		     else {
		     }
		     charCountMap.put(s,1);
		}
		System.out.println("Count of characters in a given string:" + charCountMap);
	}

}
