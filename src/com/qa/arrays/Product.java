package com.qa.arrays;

public class Product {

	int id;
	public String name;
	public double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;

	public Product(int id, String name, double price, String category, double rating, int discountPercentage,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	

	// method to find out the amount discounted.
	double discountedPrice() {
		return price - ((price / 100) * discountPercentage);
	}

	// Method to return the product with least price
	static String cheapestProduct(Product[] products) {
		double cheapestPrice = products[0].discountedPrice();
		String productName = products[0].name;
		for (Product product : products) {
			if (product.discountedPrice() < cheapestPrice) {
				cheapestPrice = product.discountedPrice();
				productName = product.name;
			}
		}
		return productName;
	}
	
	
		

		// Method to return the product with highest price
		static String highestProduct(Product[] products) {
			double highestPrice = products[0].discountedPrice();
			String productName = products[0].name;
			for (Product product : products) {
				if (product.discountedPrice() > highestPrice) {
					highestPrice = product.discountedPrice();
					productName = product.name;
				}
			}
			return productName;
		}
		
		// Method to return the product with highest rating
				static String highestRatingProduct(Product[] products) {
					double highestRating = products[0].rating;
					String productName = products[0].name;
					for (Product product : products) {
						if (product.rating > highestRating) {
							highestRating = product.rating;
							productName = product.name;
						}
					}
					return productName;
				}
}
