// WAP to find top two maximum numbers in the given array
// should not use any sorting function
// should iterate the array only once
// should not use any kind of collection
package pack1;

public class Prog27TopTwoMaxNumberInArray {
	public void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else {
				if (maxTwo < n) {
					maxTwo = n;
				}
			}
		}
		System.out.println("First Max Num : " + maxOne);
		System.out.println("Second Max Num : " + maxTwo);
	}

	public static void main(String[] args) {
		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		Prog27TopTwoMaxNumberInArray tmn = new Prog27TopTwoMaxNumberInArray();
		tmn.printTwoMaxNumbers(num);
	}
}
