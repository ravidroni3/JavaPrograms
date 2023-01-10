package Exception;

public class TryCatchBlock {
	public static void main(String args[]) {
		try {
			int a = 5 / 0;
			System.out.println("Rest of code in try block");

		} catch (Exception e) {
			System.out.println("ArithmeticException =>" + e.getMessage());
		}

	}

}
