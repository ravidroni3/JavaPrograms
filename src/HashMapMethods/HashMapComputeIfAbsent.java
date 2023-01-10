package HashMapMethods;

import java.util.HashMap;

public class HashMapComputeIfAbsent {

	public static void main(String[] args) {
		// create an HashMap
	    HashMap<String, Integer> prices = new HashMap<>();

	    // insert entries to the HashMap
	    prices.put("Shoes", 200);
	    prices.put("Bag", 300);
	    prices.put("Pant", 150);
	    System.out.println("HashMap: " + prices);

	    // compute the value of Shirt
	    int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
	    System.out.println("Price of Shirt: " + shirtPrice);

	    // print updated HashMap
	    System.out.println("Updated HashMap: " + prices);

	}

}
