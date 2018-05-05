package test.ThinkinJava.cha7;

class AClass1{
	public AClass1(String s) {
		System.out.println("AClass1 " + s);
	}
}

class BClass1{
	public BClass1(String s) {
		System.out.println("BClass1 " + s);
	}
}

class CClass1 extends AClass1{
	BClass1 b;
	public CClass1(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		this.b = new BClass1(s);
	}
}

public class E07_SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CClass1("xxx");

	}

}
