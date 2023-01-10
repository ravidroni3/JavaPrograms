package Oops;

public class InheritanceEx {
	private byte a;
	private short b;
	private int c;
	private long d;

	private float e;
	private double f;

	private boolean g;

	private char h;

	private String i;
	
	
	static {
		System.out.println("static block for InheritenceDemo");
	}
	
	static {
		System.out.println("static block1 for InheritenceDemo");
	}
	
	{
		System.out.println("instance block for InheritenceDemo");
	}
	
	{
		System.out.println("instance block1 for InheritenceDemo");
	}
	
	public InheritanceEx() {
		System.out.println("default constructor InheritenceDemo");
	}
	


	public InheritanceEx(byte a, short b, int c, long d, float e, double f, boolean g, char h, String i) {
		
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

	public byte getA() {
		return a;
	}

	public void setA(byte a) {
		this.a = a;
	}

	public short getB() {
		return b;
	}

	public void setB(short b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public long getD() {
		return d;
	}

	public void setD(long d) {
		this.d = d;
	}

	public float getE() {
		return e;
	}

	public void setE(float e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public boolean isG() {
		return g;
	}

	public void setG(boolean g) {
		this.g = g;
	}

	public char getH() {
		return h;
	}

	public void setH(char h) {
		this.h = h;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

}




