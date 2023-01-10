package MethodReferences;
//In the following example, we are referring non-static methods. 
//You can refer methods by class object and anonymous object.

interface Sayable6{
	void say();
}
public class MethodEx1 {
public void saySomething() {
	System.out.println("I am non-satitc method");
}
	public static void main(String[] args) {
		MethodEx1 methodEx1 = new MethodEx1();
		Sayable6 s =methodEx1::saySomething;
		s.say();
		

	}

}
