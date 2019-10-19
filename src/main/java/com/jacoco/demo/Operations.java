package com.jacoco.demo;

public class Operations {

	
	
	public int add(int a, int b) {
		return a + b;
	}

	
	
	public String concatStrings(String str1, String str2) {

		if (null != str1 && null != str2) {
			return str1 + " " + str2;
		}
		return "Strings should not be empty or null";
	}

	
	
	public boolean isPalindrom(String str) {

		if (null != str) {
			if (str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
				return true;
			}
		}
		return false;
	}

}
