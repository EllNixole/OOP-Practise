package com.qa.oop.practise;

import java.util.Arrays;

public class PrimitiveArrayMethods {

	// 5.d. method to return count of evens
	static int countOfEvens(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				count++;
			}

		}
		return count;
	}

	// 5.b. Method to return the smallest number of the array elements
	static int smallestOfArray(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0];
	}

	// 5.c. Method to return the highest number of the array elements
	static int largestOfArray(int[] numbers) {
		Arrays.sort(numbers);
		int n = numbers.length;
		return numbers[n - 1];
	}

	// 5.a. Method to return the sum of all array elements
	static int sumArray(int[] numbers) {

		int total;
		total = 0;

		for (int number : numbers) {
			total += number;

		}
		return total;

	}

}
