package InstanceVariables;

class Person {
	int height;
	int weight; // Instance Variables

	Person(int h, int w) {
		this.height = h;
		this.weight = w;
	}

	void run() {
		System.out.println("huff puff");
	}

	void print() {
		System.out.println("Now weight is:" + weight);
	}

	void show() {
		System.out.println("Now height is:" + height);
	}

	public static void main(String[] args) {
		Person A = new Person(170, 65);
		A.run();
		A.print();
		A.show();
	}
}