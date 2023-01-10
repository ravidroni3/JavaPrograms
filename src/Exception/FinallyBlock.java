package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int a = 5 / 0;
			System.out.println("The rest of try code");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException =>" + e.getMessage());

		} finally {
			System.out.println("The finally block code");
		}

	}

}
