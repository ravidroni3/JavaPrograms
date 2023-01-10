package CreateObjectInFiveWays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.spi.IIOServiceProvider;

import org.w3c.dom.Text;

public class Deserialization {

	public static void main(String[] args)
			throws IOException, FileNotFoundException, IOException, ClassNotFoundException {
		// serialization
		//FileOutputStream foS = new FileOutputStream("Text.txt");
		//ObjectOutputStream oos = new ObjectOutputStream(foS);
		//Student s = new Student();
		//oos.writeObject(s);

		// Deserialization
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// creating// getting this student class object
		Student s5 = (Student) ois.readObject();
		// printing to the console
		System.out.println(s5);
		// calling student class property
		s5.id = 400;
		System.out.println(s5.id);

	}

}
