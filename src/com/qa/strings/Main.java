package com.qa.strings;



public class Main {

	public static void main(String[] args) {
		
		String greeting;
		greeting = "hello how are you?";
		System.out.println(StringMethods.countWords(greeting));
		
		String[] emailAddresses = new String[] {"abc_gmail.com", "abcd*()@gmail.com",
			"abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
	
	System.out.println(StringMethods.validEmails(emailAddresses));

	}
	
	
	

}
