package String;
//The Java String compareTo() method compares 

//two strings lexicographically (in the dictionary order), ignoring case differences.

public class StringCompareIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s1 = "java"; 
		 * String s2 = "Java"; int res; res =
		 * s1.compareToIgnoreCase(s2); 
		 * System.out.println(res);
		 */
		String s1 ="java";
		String s2 ="JAVA";
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Both equal");
		}else {
			System.out.println("Both not equal");
		}
	}
}