package String;
//The replaceAll() method replaces each substring that matches the regex
//of the string with the specified text.

public class ReplaceAllEx {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		System.out.println(s1.replaceAll(s1, "Hello Welcome to java"));

	}

}
