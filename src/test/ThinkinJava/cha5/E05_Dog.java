package test.ThinkinJava.cha5;

public class E05_Dog {
	public void bark() {
		System.out.println("Default bark!");
	}
	public void bark(int i) {
		System.out.println("int bark is howl");
	}
	public void bark(double d) {
		System.out.println("double bark is yip");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E05_Dog dog = new E05_Dog();
		dog.bark();
		dog.bark(1);
		dog.bark(1.1);
	}

}
