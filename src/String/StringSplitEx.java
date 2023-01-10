package String;

//The split() method divides the string at the specified regex and returns an array of substrings.
public class StringSplitEx {
	public static void main(String args[]) {
		String text = "Welcome to java";

		String[] res = text.split(" ");

		for (String str : res) {
			System.out.print(str+ ",");
		}

	}
}