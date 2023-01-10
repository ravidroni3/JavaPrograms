package CreateObjectInFiveWays;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Cloningmethod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
// creating object using new Instance() of constructor class
		Constructor<Student> constructor = Student.class.getConstructor();
		Student s3 = constructor.newInstance();
// print the object reference to the console
		System.out.println(s3);
// calling the students class property
		s3.id = 100;
		System.out.println(s3.id);

		// ---------------------------------------------------------------
		// creating object using the class clone()
		Student s4 = (Student) s3.clone();
		// print the object reference to the console
		System.out.println(s4);
		// calling the students class property
		s4.id = 200;
		System.out.println(s4.id);

	}

}