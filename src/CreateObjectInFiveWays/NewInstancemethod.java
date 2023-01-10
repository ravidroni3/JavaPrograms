package CreateObjectInFiveWays;

public class NewInstancemethod {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// creating object using newInstance method of class Class
		// Student s2 = (Student)
		// Class.forName("CreateObjectInFiveWays.Student").newInstance();
		Student s2 = Student.class.newInstance();
		

		// print the object reference to the console
		s2.id = 3;
		// calling the student class property
		System.out.println(s2.id);

	}

}
