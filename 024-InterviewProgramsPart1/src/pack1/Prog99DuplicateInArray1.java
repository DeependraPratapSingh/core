//  Find duplicate elements in an array
//  Find duplicate elements in an integer array

package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog99DuplicateInArray1 {
	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,5,6,6,6,7,8,8};

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();
		for (Integer arrayElement : array) {
			if (!set.add(arrayElement)) {
				duplicateSet.add(arrayElement);
				//System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
		
	    Iterator iterator = duplicateSet.iterator(); 
	    while (iterator.hasNext()) {
	       System.out.println("Value: "+iterator.next() + " ");  
	    }
	}
}
