package Exception;

import java.io.File;
import java.io.FileInputStream;

public class ThrowsEx {
	public static void m1()throws Exception{
		File f = new File("abc.txt");
		FileInputStream s =new FileInputStream(f);	
	}

	public static void main(String[] args) {
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
