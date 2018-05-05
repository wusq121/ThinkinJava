package test.ThinkinJava.cha7;

class Component1b{
	public Component1b(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component1b " + i);
	}
}

class Component2b{
	public Component2b(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component2b " + i);
	}
}

class Component3b{
	public Component3b(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component3b " + i);
	}
}

class Rootb{
	Component1b component1 = new Component1b(1);
	Component2b component2 = new Component2b(2);
	Component3b component3 = new Component3b(3);
	public Rootb(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Rootb " + i);
	}
}

class Stemb extends Rootb{
	Component1b component1 = new Component1b(4);
	Component2b component2 = new Component2b(5);
	Component3b component3 = new Component3b(6);
	public Stemb(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Stemb " + i);
	}
}

public class E10_ConstructorOrder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stemb(7);
	}

}
