package FunctionalInterfaces;

interface sayable7 {
	void say(String msg);

}

public class Example1 implements sayable7 {
	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {

		Example1 s = new Example1();
		s.say("Hello");
	}

}
