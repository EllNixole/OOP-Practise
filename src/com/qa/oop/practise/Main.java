package com.qa.oop.practise;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		
		Product apple = new Product(1, "Pink Lady Apple", 1.00, "Fruit", 4.5, 50, true);
		Product carrot = new Product(2, "Large Carrots", 1.05, "Vegetable", 4.0, 0, true);
		Product strawberry = new Product(3, "Fresh Strawberries", 2.50, "Fruit", 4.8, 50, false);
		
		carrot.productInfo();
		carrot.discountedPrice();
		carrot.finalPrice();
		System.out.println();
		
		apple.discountedPrice();
		strawberry.finalPrice();
		
		System.out.println(Product.sellerContactDetails(Product.SELLER_NAME, Product.CONTACT_NO, Product.EMAIL_ADDRESS));
		
		int[] numbers = {1,6,2,8,3,9,15,0};
		System.out.println(sumArray(numbers));
		System.out.println(smallestOfArray(numbers));
		System.out.println(largestOfArray(numbers));
		
		
			
		}
	
	// 5.a. Method to return the sum of all array elements
	static int sumArray(int[] numbers){
		
		
		int total;
		total = 0;
		
		for(int number : numbers)
		{
			total += number;
			
		}
		return total;
		
	
	}
	
	// 5.b.  Method to return the smallest number of the array elements
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
	
		
	}

	


