package org.capgemini.util;

public class ProductUtility {
	
	private static int productId=0;
	
	public static int generateProductId(){
		System.out.println("Test123");
		return productId++;
	}

}
