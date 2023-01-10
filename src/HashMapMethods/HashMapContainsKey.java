package HashMapMethods;

import java.util.HashMap;

public class HashMapContainsKey {

	public static void main(String[] args) {
		HashMap<String, String> details = new HashMap<>();

	    // add mappings to HashMap
	    details.put("Name", "Programiz");
	    details.put("Domain", "programiz.com");
	    details.put("Location", "Nepal");
	    System.out.println("Programiz Details: \n" + details);

	    // check if key Domain is present
	    if(details.containsKey("Domain")) {
	      System.out.println("Domain name is present in the Hashmap.");

	}

	}
}
