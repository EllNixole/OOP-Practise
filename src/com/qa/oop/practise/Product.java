package com.qa.oop.practise;

public class Product {

	// 1. Working with classes and objects
	int id;
	public String name;
	public double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;

	// 4.Working with static members
	static String SELLER_NAME;
	static String CONTACT_NO;
	static String EMAIL_ADDRESS;

	static String sellerContactDetails(String a, String b, String c) {
		a = "ASDA";
		b = "0743785477";
		c = "asda@asda.com";

		return "Name: " + a + "\nContact Number: " + b + "\nEmail Address: " + c;
	}

	// 3. Working with constructors
	public Product(int id, String name, double price, String category, double rating, int discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}

	// 2: Working with methods

	// Product info method.
	void productInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("Discount: " + discountPercentage + "%");
		System.out.println("In Stock: " + isAvailable);
	}

	// method to find out the amount discounted.
	double discountedPrice() {
		return (price / 100) * discountPercentage;
	}

	// method to find out the final price after discount.
	void finalPrice() {
		System.out.println(price - ((price / 100) * discountPercentage));
	}

}
