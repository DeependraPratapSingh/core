// WAP to sort an array when two halves are sorted
// Given an integer array of which both first and second half are sorted.
// Task is to merge two sorted halves of array into single sorted array.
//
// Input  A[] = {2,3,8,-1,7,8}
// Output -1,2,3,7,8,10
//
// Input A[] = {-4,6,9,-1,-3}
// Output -4,-3,-1,6,9
package pack1;

import java.util.Arrays;

public class Prog29SortArrayWhenHalvesSorted {
	public static void mergeTwoHalf(int[] A, int n) {
		Arrays.sort(A);
	}

	public static void main(String[] args) {
		int[] A = { -4, 6, 9, -1, -3 };
		int n = A.length;
		mergeTwoHalf(A, n);

		for (int i = 0; i < n; i++) {
			System.out.println(A[i] + " ");
		}
	}
}