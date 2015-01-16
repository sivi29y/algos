package week1_merge_inversions;

import java.io.IOException;
import java.util.Arrays;

public class MergeSort {

	private static int[] arr;

	public static void main(String[] args) {

		readinput();

		merge(arr);

		System.out.println("Result size: " + arr.length);
		System.out.println("Result: " + Arrays.toString(arr));
	}

	private static void merge(int[] C) {

		// base case
		if (C.length == 1)
			return;

		int[] A = Arrays.copyOfRange(C, 0, C.length / 2);
		int[] B = Arrays.copyOfRange(C, C.length / 2, C.length);
		merge(A);
		merge(B);
		mergesort(C, A, B);

	}

	private static void mergesort(int[] C, int[] A, int[] B) {

		// Here is a recursive merge functionh

		// base case if 0 or 1 return
		if (A.length == 0 || B.length == 0)
			return;
		// merge step
		int i = 0;
		int j = 0;

		System.out.println("merged i,j, Length=" + i + " " + j + " " + C.length);
		System.out.println("C: " + Arrays.toString(C));
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));

		for (int k = 0; k < C.length; k++) {
			if (j >= B.length) { 
				//if j is already all gone we add the other part of the sorted array to list
				System.arraycopy(A, i, C, k, A.length - i);
				System.out.println("i,j,k =" + i + " " + j + " " + k);
				System.out.println("C: " + Arrays.toString(C));
				System.out.println("A: " + Arrays.toString(A));
				System.out.println("B: " + Arrays.toString(B));
				return;
			}

			if (i >= A.length) {
				//if i is already all added we add the other part of the sorted array to list
				System.arraycopy(B, j, C, k, B.length - j);
				System.out.println("i,j,k =" + i + " " + j + " " + k);
				System.out.println("C: " + Arrays.toString(C));
				System.out.println("A: " + Arrays.toString(A));
				System.out.println("B: " + Arrays.toString(B));
				return;
			}
			if (A[i] < B[j]) {
				System.out.println("i,j,k =" + i + " " + j + " " + k);
				System.out.println("C: " + Arrays.toString(C));
				System.out.println("A: " + Arrays.toString(A));
				System.out.println("B: " + Arrays.toString(B));
				C[k] = A[i];
				i++;

			} else {
				System.out.println("i,j,k =" + i + " " + j + " " + k);
				System.out.println("C: " + Arrays.toString(C));
				System.out.println("A: " + Arrays.toString(A));
				System.out.println("B: " + Arrays.toString(B));
				C[k] = B[j];
				j++;

			}
		}

	

	}

	private static void readinput() {
		// TODO Auto-generated method stub
		try {
			arr = ReadNumbers.txt2IntArr();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}