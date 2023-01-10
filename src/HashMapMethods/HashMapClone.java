package HashMapMethods;

import java.util.HashMap;

public class HashMapClone {

	public static void main(String[] args) {
		 HashMap<String, Integer> languages = new HashMap<>();

	        languages.put("Java", 14);
	        languages.put("Python", 3);
	        languages.put("JavaScript", 1);
	        System.out.println("HashMap: " + languages);

	        // create copy of languages
	        HashMap<String, Integer> cloneLanguages = (HashMap<String, Integer>)languages.clone();
	        System.out.println("Cloned HashMap: " + cloneLanguages);

	}

}
