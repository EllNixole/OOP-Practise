package com.qa.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {

		Product[] products;
		products = new Product[5];
		products[0] = new Product(1, "Apple", 0.50, "Fruit", 4.5, 5, true);
		products[1] = new Product(2, "Carrot", 0.80, "Vegetable", 3.0, 10, false);
		products[2] = new Product(3, "Banana", 1.00, "Fruit", 4.5, 0, false);
		products[3] = new Product(4, "Cherries", 2.00, "Fruit", 5.0, 50, true);
		products[4] = new Product(5, "Broccoli", 0.85, "Vegetable", 2.5, 10, true);

		String theCheapestItem = Product.cheapestProduct(products);
		System.out.println("The cheapest discounted item is: " + theCheapestItem);

	}

}
