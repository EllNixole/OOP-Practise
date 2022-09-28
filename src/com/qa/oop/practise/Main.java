package com.qa.oop.practise;

public class Main {

	public static void main(String[] args) {
		
		Product apple = new Product();
		apple.id = 1;
		apple.name = "Pink Lady Apple";
		apple.price = 0.78;
		apple.category = "Fruit";
		apple.rating = 4.5;
		apple.discountPercentage = 5;
		apple.isAvailable = 'Y';
		
		Product carrot = new Product();
		carrot.id = 2;
		carrot.name = "Large Carrots";
		carrot.price = 1.05;
		carrot.category = "Vegetable";
		carrot.rating = 4.0;
		carrot.discountPercentage = 0;
		carrot.isAvailable = 'Y';
		
		Product strawberry = new Product();
		strawberry.id = 3;
		strawberry.name = "Fresh British Strawberries";
		strawberry.price = 2.50;
		strawberry.category = "Fruit";
		strawberry.rating = 4.8;
		strawberry.discountPercentage = 10;
		strawberry.isAvailable = 'N';
		
		System.out.println("Id: " + apple.id);
		System.out.println("Name: " + apple.name);
		System.out.println("Price: " + apple.price);
		System.out.println("Category: " + apple.category);
		System.out.println("Rating: " + apple.rating);
		System.out.println("Discount: " + apple.discountPercentage + "%");
		System.out.println("In Stock: " + apple.isAvailable);
		System.out.println();
		System.out.println("Id: " + carrot.id);
		System.out.println("Name: " + carrot.name);
		System.out.println("Price: " + carrot.price);
		System.out.println("Category: " + carrot.category);
		System.out.println("Rating: " + carrot.rating);
		System.out.println("Discount: " + carrot.discountPercentage + "%");
		System.out.println("In Stock: " + carrot.isAvailable);
		System.out.println();
		System.out.println("Id: " + strawberry.id);
		System.out.println("Name: " + strawberry.name);
		System.out.println("Price: " + strawberry.price);
		System.out.println("Category: " + strawberry.category);
		System.out.println("Rating: " + strawberry.rating);
		System.out.println("Discount: " + strawberry.discountPercentage + "%");
		System.out.println("In Stock: " + strawberry.isAvailable);

	}

}
