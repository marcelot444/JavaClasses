package com.class26;

class StoreProduct {

	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;

	StoreProduct(String labell, int pricee, String categoryy, boolean hasExpirationn, int stockk) {
		label = labell;
		price = pricee;
		category = categoryy;
		hasExpiration = hasExpirationn;
		stock = stockk;
	}

	StoreProduct(String labell, int pricee, int stockk) {
		label = labell;
		price = pricee;
		category = "misc";
		hasExpiration = false;
		stock = stockk;
	}

	StoreProduct(String labell, int pricee) {
		label = labell;
		price = pricee;
		stock = 0;
	}

	void display() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}

}
