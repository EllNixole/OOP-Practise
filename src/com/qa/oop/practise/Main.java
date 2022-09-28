package com.qa.oop.practise;

public class Main {

	public static void main(String[] args) {
		
		Product apple = new Product();
		apple.id = 1;
		apple.name = "Pink Lady Apple";
		apple.price = 1.00;
		apple.category = "Fruit";
		apple.rating = 4.5;
		apple.discountPercentage = 50;
		apple.isAvailable = true;
		
		Product carrot = new Product();
		carrot.id = 2;
		carrot.name = "Large Carrots";
		carrot.price = 1.05;
		carrot.category = "Vegetable";
		carrot.rating = 4.0;
		carrot.discountPercentage = 0;
		carrot.isAvailable = true;
		
		Product strawberry = new Product();
		strawberry.id = 3;
		strawberry.name = "Fresh Strawberries";
		strawberry.price = 2.50;
		strawberry.category = "Fruit";
		strawberry.rating = 4.8;
		strawberry.discountPercentage = 50;
		strawberry.isAvailable = false;
		
		carrot.productInfo();
		apple.discountedPrice();
		strawberry.finalPrice();
		
		
		
			
		}

	}


