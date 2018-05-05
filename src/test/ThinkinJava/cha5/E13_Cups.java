package test.ThinkinJava.cha5;

public class E13_Cups {
	static E13_Cup cup1;
	static E13_Cup cup2;
	static {
		cup1 = new E13_Cup(1);
		cup2 = new E13_Cup(2);
	}
	public E13_Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cups()");
	}
}
