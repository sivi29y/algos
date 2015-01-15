package week1_merge_inversions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"src/week1_merge_inversions/integerArray.txt"));
		// read to a list first, if number of lines is unknown
		List<Integer> myList = new ArrayList<Integer>();
		try {
			String s;
			while ((s = reader.readLine()) != null) {
				try {
					myList.add(Integer.parseInt(s));
				} catch (NumberFormatException ignoreMe) {
					// ignore empty lines and garbage
				}
			}
		} finally {
			reader.close();
		}
		// convert to array of ints
		int[] myArray = new int[myList.size()];
		int i = 0;
		for (Integer num : myList) {
			myArray[i++] = num;
		}
		System.out.println("Result size: " + myArray.length);
		// System.out.println("Result: " + Arrays.toString(myArray));
	}
}
