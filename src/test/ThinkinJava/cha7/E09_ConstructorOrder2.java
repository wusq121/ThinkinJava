package test.ThinkinJava.cha7;

class Component1{
	public Component1() {
		// TODO Auto-generated constructor stub
		System.out.println("Component1");
	}
}

class Component2{
	public Component2() {
		// TODO Auto-generated constructor stub
		System.out.println("Component2");
	}
}

class Component3{
	public Component3() {
		// TODO Auto-generated constructor stub
		System.out.println("Component3");
	}
}

class Root{
	Component1 component1 = new Component1();
	Component2 component2 = new Component2();
	Component3 component3 = new Component3();
	public Root() {
		// TODO Auto-generated constructor stub
		System.out.println("Root");
	}
}

class Stem extends Root{
	Component1 component1 = new Component1();
	Component2 component2 = new Component2();
	Component3 component3 = new Component3();
	public Stem() {
		// TODO Auto-generated constructor stub
		System.out.println("Stem");
	}
}

public class E09_ConstructorOrder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stem();
	}

}
