package test.ThinkinJava.cha8;

class TwoMethods{
	void m1() {
		System.out.println("Inside m1, calling m2");
		m2();
	}
	void m2() {
		System.out.println("Inside m2.");
	}
}

class Inherited extends TwoMethods{
	void m2() {
		System.out.println("Inside Inherited.m2");
	}
}
public class E10_MethodCalls {

	public static void main(String[] args) {
		TwoMethods x = new Inherited();
		x.m1();
	}
}
