package Day31Array;

import java.util.Arrays;

public class Array11 {
	// Java Program to clone the array
	public static void main(String args[]) {
		int numberArray[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : numberArray) {
			System.out.println(i);
		}
		System.out.println("Printing clone of the array:");
		int copyOfNumberArray[] = numberArray.clone();
		for (int i : copyOfNumberArray) {
			System.out.println(i);
		}
		System.out.println("Are both equal numberArray & copyOfNumberArray ?");
		System.out.println(Arrays.equals(numberArray, copyOfNumberArray));
		System.out.println("******************************");
		Arrays.sort(numberArray);//sort the array elements in ascending order and stores the sorted element in the same array
		System.out.println("After sorting original array:");
		System.out.println("Are both equal numberArray & copyOfNumberArray ?");
		System.out.println(Arrays.equals(numberArray, copyOfNumberArray));
	}
}