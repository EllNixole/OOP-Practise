package com.qa.oop.practise;

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
		
		
		
			
		}

	}


