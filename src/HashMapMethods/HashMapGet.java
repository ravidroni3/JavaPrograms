package HashMapMethods;

import java.util.HashMap;

public class HashMapGet {

	public static void main(String[] args) {
		// create an HashMap
	    HashMap<Integer, String> numbers = new HashMap<>();
	    numbers.put(1, "Java");
	    numbers.put(2, "Python");
	    numbers.put(3, "JavaScript");

	    // get the value with key 1
	    String value = numbers.get(1);

	    System.out.println("HashMap Value with Key 1: " + value);
	}

}
