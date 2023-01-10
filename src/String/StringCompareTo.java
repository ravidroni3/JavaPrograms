package String;
//The compareTo() method compares two strings lexicographically (in the dictionary order). 
//The comparison is based on the Unicode value of each character in the strings.

public class StringCompareTo {

	public static void main(String[] args) {
	
		/*
		 * String s1 = "ram"; String s2 = "jun"; 
		 * int res; res = s1.compareTo(s2);
		 * System.out.println(res);
		 */
		String s1 = "Java";
		String s2 = "Python";
		if(s1.compareTo(s2)==0) {
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Both are not Equal");
		}
	}

}
