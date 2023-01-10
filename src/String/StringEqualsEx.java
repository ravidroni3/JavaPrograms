package String;
//The equals() method returns true if two strings are equal. If not, it returns false

public class StringEqualsEx {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = "JAVA";
		boolean res = s1.equals(s2);
		System.out.println(res);
		boolean res1 = s3.equals(s1);
		System.out.println(res1);
		

	}

}
