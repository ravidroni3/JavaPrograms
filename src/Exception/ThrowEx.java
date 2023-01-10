package Exception;

public class ThrowEx {
	public static void m1() {
		throw new ArithmeticException("ArithmeticException devideby zero");
	}

	public static void main(String[] args) {
		m1();

	}

}
