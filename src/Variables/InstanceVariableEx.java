package Variables;

public class InstanceVariableEx {
	
	byte a;
	short b;
	int c;
	long d;
	
	double e;
	float f;
	
	char g;
	boolean h;
	
	String i;
	

	public InstanceVariableEx() {
		super();
		
	}


	public InstanceVariableEx(byte a, short b, int c, long d, double e, float f, char g, boolean h, String i) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
	}


	public static void main(String[] args) {
		
		InstanceVariableEx instanceVariable = new InstanceVariableEx();
		InstanceVariableEx instanceVariable1 = new InstanceVariableEx();
		
		
		
		
		System.out.println(instanceVariable.a);
		System.out.println(instanceVariable.b);
		System.out.println(instanceVariable.c);
		System.out.println(instanceVariable.d);
		System.out.println(instanceVariable.e);
		System.out.println(instanceVariable.f);
		System.out.println(instanceVariable.g);
		System.out.println(instanceVariable.h);
		System.out.println(instanceVariable.i);
		
		System.out.println("***************");
		
		
		System.out.println(instanceVariable1.a);
		System.out.println(instanceVariable1.b);
		System.out.println(instanceVariable1.c);
		System.out.println(instanceVariable1.d);
		System.out.println(instanceVariable1.e);
		System.out.println(instanceVariable1.f);
		System.out.println(instanceVariable1.g);
		System.out.println(instanceVariable1.h);
		System.out.println(instanceVariable1.i);
		
		
		
		m1();
		instanceVariable.m2();
	}
	
	static void m1(){
		System.out.println("m1 static method");
		return;
	}

	void m2(){
		m2(5);
		m3();
		System.out.println("m2 instance method");
	}

	static int m2(int x){
		return x;
	}
	
	void m3() {
		System.out.println("m3 instance method");
	}

}
