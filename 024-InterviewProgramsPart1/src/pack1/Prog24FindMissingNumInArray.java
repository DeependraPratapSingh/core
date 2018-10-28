// WAP to find missing number in an array
// ExpectedSum = (n*(n+1))/2
// ActualSum = Sum of given numbers
// MissigNumber = ExpectedSum - ActualSum
package pack1;

import java.util.Arrays;

public class Prog24FindMissingNumInArray {
	private static int getMissingNumber(int[] array, int n) {
		int actualSum = 0;
		int expectedSum = (n * (n + 1)) / 2;
		for (int i : array) {
			actualSum = actualSum + i;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6 };
		int missingNumber = getMissingNumber(array, 6);
		System.out.println("Missing Number in array %s is %d %n " + Arrays.toString(array) + " is " + missingNumber);
	}
}
