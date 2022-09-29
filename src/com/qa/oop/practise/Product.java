package com.qa.oop.practise;

public class Product {
	
	
	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;
	
	static String SELLER_NAME;
	static String CONTACT_NO;
	static String EMAIL_ADDRESS;
	
	
	static String sellerContactDetails(String a, String b, String c) {
		a = "ASDA";
		b = "0743785477";
		c = "asda@asda.com";
		
		return a + "\n" + b + "\n" + c;
	}
	

	
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

	//Task 2: Methods.
	
	//Product info method.
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
	void discountedPrice()
	{
		System.out.println((price /100) * discountPercentage);
	}
	
	//method to find out the final price after discount.
	void finalPrice() {
		System.out.println(price - ((price /100) * discountPercentage));
	}
	 
	 

}
