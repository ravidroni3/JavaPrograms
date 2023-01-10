package StaticMethods;

interface A {
	public static void m1() {
		System.out.println("call me with the Interface name");
	}
}

class StaticMethodEx implements A {
	public static void main(String[] args) {
		A.m1(); // only way to call interface's static methods
	}
	
}
