// WAP to find out duplicate number between 1 to n numbers.
package pack1;

import java.util.ArrayList;
import java.util.List;

public class Prog23FindDuplicateNum {
	public int findDuplicateNumber(List<Integer> numbers) {
		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public int getSum(List<Integer> number) {
		int sum = 0;
		for (int num : number) {
			sum = sum + num;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 30; i++) {
			numbers.add(i);
		}
		numbers.add(22);
		Prog23FindDuplicateNum fdn = new Prog23FindDuplicateNum();
		System.out.println("DuplicateNumber : " + fdn.findDuplicateNumber(numbers));
	}
}