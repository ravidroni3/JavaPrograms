package LambdaExpressions;

//multiple parameters

interface Integers {
	int add(int a, int b);
}

public class MultipleParameters {

	public static void main(String[] args) {
		Integers one = (a, b) -> (a + b);
		System.out.println("Result is " + one.add(10, 20));

		Integers two = (int a, int b) -> a + b;
		System.out.println("Result is " + two.add(100, 200));

		Integers three = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(three.add(100, 200));
		
		Integers four = (int a,int b)-> a+b;
		System.out.println(four.add(20,30));

	}
}
