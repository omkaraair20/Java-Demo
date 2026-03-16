package Arrays;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicates {

	public static void main(String[] args) {
		 int[] array= {5,2,9,1,6,2,5};
         
		 int[] uniqueArray=removeDuplicates(array);
		 
		 System.out.println("Array with duplicates removed.");
		 for(int num:uniqueArray) {
			 System.out.println(num+" ");
		 }
	}
    
	public static int[] removeDuplicates(int[] array) {
		Set<Integer> set=new HashSet<>();
		for(int num:array) {
			set.add(num);
		}
		
		int[] result=new int[set.size()];
		int i=0;
		for(int num:set) {
			result[i++]=num;
		}
		return result;
	}
}
