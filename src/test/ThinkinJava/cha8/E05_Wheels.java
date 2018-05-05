package test.ThinkinJava.cha8;

class Cycle2{
	void ride() {
		System.out.println("Cycle2.ride()");
	}
	int wheels() {
		return 0;
	}
}

class Unicycle2 extends Cycle2{
	void ride() {
		System.out.println("Unicycle2.ride()");
	}
	int wheels() {
		return 1;
	}
}

class Bicycle2 extends Cycle2{
	void ride() {
		System.out.println("Bicycle2.ride()");
	}
	int wheels() {
		return 2;
	}
}

class Tricycle2 extends Cycle2{
	void ride() {
		System.out.println("Tricycle2.ride()");
	}
	int wheels() {
		return 3;
	}
}

class Person2{
	public static void trip(Cycle2 c) {
		c.ride();
	}
	public static void ride(Cycle2 c) {
		System.out.println("Numbers of wheels: " + c.wheels());
	}
}

public class E05_Wheels {

	public static void main(String[] args) {
		Person2.ride(new Unicycle2());
		Person2.ride(new Bicycle2());
		Person2.ride(new Tricycle2());
	}
}
