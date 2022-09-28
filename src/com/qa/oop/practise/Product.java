package com.qa.oop.practise;

public class Product {
	
	
	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;
	
	
	//Task 2: Methods.
	void productInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("Discount: " + discountPercentage + "%");
		System.out.println("In Stock: " + isAvailable);
		
	}
	
	void discountedPrice()
	{
		System.out.println((price /100) * discountPercentage);
	}
	
	void finalPrice() {
		System.out.println(price - ((price /100) * discountPercentage));
	}
	 
	 

}
