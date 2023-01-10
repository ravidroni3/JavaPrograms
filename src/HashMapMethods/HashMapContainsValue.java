package HashMapMethods;

import java.util.HashMap;

public class HashMapContainsValue {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();

	    // add mappings to HashMap
	    languages.put(1, "Python");
	    languages.put(2, "Java");
	    languages.put(3, "JS");
	    System.out.println("HashMap" + languages);

	    // check if value Java is present
	    if(languages.containsValue("Java")) {
	      System.out.println("Java is present on the list.");
	    }

	  }
	}