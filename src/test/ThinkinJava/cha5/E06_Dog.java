package test.ThinkinJava.cha5;

public class E06_Dog {
	public void bark(int i, double d) {
		System.out.println("howl");
	}
	public void bark(double d, int i) {
		System.out.println("yip");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06_Dog dog = new E06_Dog();
		dog.bark(5, 5.1);
		dog.bark(5.1, 6);
	}

}
