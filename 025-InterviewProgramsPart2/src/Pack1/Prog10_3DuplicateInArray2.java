//  Find duplicate elements in an array
//  Find duplicate elements in an integer array

package Pack1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prog10_3DuplicateInArray2 {
	public static void DuplicateNum(int[] array) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		for (Integer num : array) {
			if (!hm.containsKey(num))
				hm.put(num, 1);
			else
				hm.put(num, hm.get(num) + 1);
		}
		Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,6,7,8,8,8,8,4,4,4};
		Prog10_3DuplicateInArray2.DuplicateNum(array);
	}
}