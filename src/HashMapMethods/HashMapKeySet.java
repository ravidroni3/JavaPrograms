package HashMapMethods;

import java.util.HashMap;

public class HashMapKeySet {

	public static void main(String[] args) {
		// create an HashMap
	    HashMap<String, Integer> prices = new HashMap<>();

	    // insert entries to the HashMap
	    prices.put("Shoes", 200);
	    prices.put("Bag", 300);
	    prices.put("Pant", 150);
	    System.out.println("HashMap: " + prices);

	    // return set view of all keys
	    System.out.println("Keys: " + prices.keySet());

	}

}
