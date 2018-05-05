package test.ThinkinJava.cha5;

public class E02_initialize {
	String string = "xxx";
	public E02_initialize() {
		// TODO Auto-generated constructor stub
	}
	public E02_initialize(String string) {
		this.string = string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_initialize e = new E02_initialize();
		System.out.println(e.string);
		E02_initialize f = new E02_initialize("YYY");
		System.out.println(f.string);
	}
}
