package HashMapMethods;

import java.util.HashMap;

public class HashMapPut {

	public static void main(String[] args) {
		 HashMap<String, Integer> languages = new HashMap<>();

		    // insert items to the HashMap
		    languages.put("Java", 14);
		    languages.put("Python", 3);
		    languages.put("JavaScript", 1);

		    // display the HashMap
		    System.out.println("Programming Languages: " + languages);
	}

}
