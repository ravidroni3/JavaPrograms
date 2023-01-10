package Conversions;

//We can convert String to char in java using charAt() method of String class.
public class StringToChar {

	public static void main(String[] args) {
		String s = "Hello";
		for (int i = 0; i <s.length(); i++) {

			char c = s.charAt(i);

			System.out.println("char At "+i+" position "+c);

		}

	}
}
