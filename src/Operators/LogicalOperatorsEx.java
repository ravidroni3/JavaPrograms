package Operators;

public class LogicalOperatorsEx {

	public static void main(String[] args) {
		byte x = 10;
		byte y = 8;
		byte z = 5;
		if (x < y && x > z) {
			System.out.println("x is smaller than y, z first if");
		}
		if (x < y || x > z) {
			System.out.println("x is smaller than y, z second if");
		}

	}

}
