package CreateObjectInFiveWays;

public class UsingNewKeyword {

	public static void main(String[] args) {
		// creating object by using new keyword
		Student s1 = new Student();
		// printing the object reference
		System.out.println(s1);
		// calling student class properties
		s1.id = 2;
		System.out.println(s1.id);

	}

}
