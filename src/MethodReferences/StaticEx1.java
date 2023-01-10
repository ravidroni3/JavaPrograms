package MethodReferences;

//functional interface and referring a static method

interface Sayble5{
	void say();
}

public class StaticEx1 {
	public static void saySomething() {
		System.out.println("I am static method");
	}

	public static void main(String[] args) {
		
		Sayble5 s =StaticEx1::saySomething;
		
		s.say();
	

	}

}
