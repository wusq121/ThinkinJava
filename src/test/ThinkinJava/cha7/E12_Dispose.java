package test.ThinkinJava.cha7;

class Component1c{
	public Component1c() {
		// TODO Auto-generated constructor stub
		System.out.println("Component1c");
	}
	public void dispose(){
		System.out.println("Component1c dispose");
	}
}

class Component2c{
	public Component2c() {
		// TODO Auto-generated constructor stub
		System.out.println("Component2c");
	}
	public void dispose(){
		System.out.println("Component2c dispose");
	}
}

class Component3c{
	public Component3c() {
		// TODO Auto-generated constructor stub
		System.out.println("Component3c");
	}
	public void dispose(){
		System.out.println("Component3c dispose");
	}
}

class Rootc{
	Component1c component1 = new Component1c();
	Component2c component2 = new Component2c();
	Component3c component3 = new Component3c();
	public Rootc() {
		// TODO Auto-generated constructor stub
		System.out.println("Rootc");
	}
	public void dispose(){
		System.out.println("Rootc dispose");
		component3.dispose();
		component2.dispose();
		component1.dispose();
	}
}

class Stemc extends Rootc{
	Component1c component1 = new Component1c();
	Component2c component2 = new Component2c();
	Component3c component3 = new Component3c();
	public Stemc() {
		// TODO Auto-generated constructor stub
		System.out.println("Stemc");
	}
	public void dispose(){
		System.out.println("Stemc dispose");
		component3.dispose();
		component2.dispose();
		component1.dispose();
		super.dispose();
	}
}
public class E12_Dispose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stemc().dispose();
	}
}
