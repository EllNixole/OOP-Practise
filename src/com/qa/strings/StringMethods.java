package com.qa.strings;

public class StringMethods {
	
    // Method to count number of words in a string
	static int countWords(String x) {
		String[] xArray = x.split(" ");
		return xArray.length;
	}
	
	static int validEmails(String[] emails) 
	{
		String regEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		int validCount = 0;
		for ( String email : emails) 
		{
			if(email.matches(regEx)) 
			{
				validCount++;
			}
		}
		return validCount;
	}
	
}

 