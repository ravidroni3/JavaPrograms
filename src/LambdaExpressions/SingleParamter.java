package LambdaExpressions;

//single parameter

interface Sayable1{
	public String say(String name);
}

public class SingleParamter {

	public static void main(String[] args) {
		Sayable1 s1 = (name)->{return "Hello " +name ;};
		
		System.out.println("Hello "+ ("ram"));
		
		Sayable1 s2 = name->{return "Hello " +name;};
		System.out.println("Heloo " +("ajay"));
		
		
		

	}

}
