package Arrays;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        
        if(!arrayList.isEmpty()) {
        	String firstElement=arrayList.get(0);
        	String lastElement=arrayList.get(arrayList.size() -1);
        	System.out.println("First element:"+firstElement);
        	System.out.println("Second element:"+lastElement);
        	System.out.println("The Arraylist is empty.");
        }
	}

}
