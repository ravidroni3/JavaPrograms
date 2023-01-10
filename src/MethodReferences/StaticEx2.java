package MethodReferences;

import java.util.function.BiFunction;

//You can also use predefined functional interface to refer methods. 
//In the following example, we are using BiFunction interface and using it's apply() method.


class Arithmetic{
	public static int add(int a, int b) {
		return a+b;
		
	}
}

public class StaticEx2 {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>b = Arithmetic::add;
		int res = b.apply(10,20);
		System.out.println(res);
		
		

	}

}
