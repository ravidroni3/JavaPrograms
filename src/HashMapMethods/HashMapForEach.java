package HashMapMethods;

import java.util.HashMap;

public class HashMapForEach {

	public static void main(String[] args) {
		// create a HashMap
	    HashMap<String, Integer> prices = new HashMap<>();

	    // insert entries to the HashMap
	    prices.put("Shoes", 200);
	    prices.put("Bag", 300);
	    prices.put("Pant", 150);
	    System.out.println("Normal Price: " + prices);

	    System.out.print("Discounted Price: ");

	    // pass lambda expression to forEach()
	    prices.forEach((key, value) -> {

	      // decrease value by 10%
	      value = value - value * 10/100;
	      System.out.print(key + "=" + value + " ");
	    });
	  }
	}