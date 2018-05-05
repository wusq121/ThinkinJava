package test.ThinkinJava.cha8;

class Cycle{
	void ride() {
		System.out.println("Cycle.ride()");
	}
}

class Unicycle extends Cycle{
	void ride() {
		System.out.println("Unicycle.ride()");
	}
}

class Bicycle extends Cycle{
	void ride() {
		System.out.println("Bicycle.ride()");
	}
}

class Tricycle extends Cycle{
	void ride() {
		System.out.println("Tricycle.ride()");
	}
}

class Person{
	public static void trip(Cycle c) {
		c.ride();
	}
}

public class E01_Cycle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		Unicycle u = new Unicycle();
		Person.trip(u);
		Person.trip(t);
		Person.trip(b);
	}

}
