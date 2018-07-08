// WAP to find duplicate elements in array.
// WAP to find duplicate elements in an integer array.
package Pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog12DuplicatesInIntegerArray {
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,4,5,5,5,5,5,6,6,7};
		findDuplicates(arr);
	}
	public static void findDuplicates(int[] arr){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Integer i : arr) {
			if ( !hm.containsKey(i)) 
				hm.put(i, 1);
			else 
				hm.put(i, hm.get(i)+1);	
		}
		
		Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
		for (Map.Entry<Integer, Integer> entry : set) {
			if (entry.getValue() > 1) {
				System.out.println("key :"+entry.getKey()+" , value :"+entry.getValue());
			}
		}
	}
}
