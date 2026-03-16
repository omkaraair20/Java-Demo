package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Common_elements {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5};
        int[] array2= {4,5,6,7,8};
        Set<Integer> commonElements=findCommonElements(array1,array2);
        System.out.println("Common elements:"+commonElements);
	}
	
	public static Set<Integer> findCommonElements(int[] array1,int[] array2){
		Set<Integer> set=new HashSet<>();
		Set<Integer> commonSet=new HashSet<>();
		
		for(int num:array1) {
			set.add(num);
		}
		
		for(int num:array2) {
			if(set.contains(num)) {
				commonSet.add(num);
			}
		}
		return commonSet;
	}

}
