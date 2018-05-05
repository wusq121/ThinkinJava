package test.ThinkinJava.cha5;

public class E09_ThisConstructorCall {
	String s = "value";
	int i = 0;
	public E09_ThisConstructorCall() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public E09_ThisConstructorCall(String ss){
		this();
		this.s = ss;
		System.out.println("Constructor w/ String arg only, s = " + ss);
	}
	public E09_ThisConstructorCall(int ii){
		this();
		this.i = ii;
		System.out.println("Constructor w/ int arg only, i = " + ii);
	}
	public E09_ThisConstructorCall(String ss, int ii){
		this(ss);
		this.i = ii;
		System.out.println("string & int args");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E09_ThisConstructorCall("xxx", 9);
	}

}
