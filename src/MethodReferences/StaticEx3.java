package MethodReferences;

import java.util.function.BiFunction;

//You can also override static methods by referring methods. 
//In the following example, we have defined and overloaded three add methods.

class Ar {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class StaticEx3 {
	public static void main(String args[]) {
		BiFunction<Integer, Integer, Integer> b = Ar::add;
		int res = b.apply(10, 20);

		BiFunction<Float, Integer, Float> c = Ar::add;
		float res1 = c.apply(10.0f, 20);

		BiFunction<Float, Float, Float> d = Ar::add;
		float res2 = d.apply(10.0f, 20.0f);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}


}
