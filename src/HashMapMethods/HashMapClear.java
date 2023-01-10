package HashMapMethods;

import java.util.HashMap;

public class HashMapClear {

	public static void main(String[] args) {
	        HashMap<String, Integer> numbers = new HashMap<>();
	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("HashMap: " + numbers);

	        // remove all mappings from HashMap
	        numbers.clear();
	        System.out.println("HashMap after clear(): " + numbers);

	}

}
