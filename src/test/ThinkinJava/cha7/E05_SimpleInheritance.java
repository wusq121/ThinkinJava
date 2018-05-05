package test.ThinkinJava.cha7;


class AClass{
	public AClass() {
		System.out.println("AClass");
	}
}

class BClass{
	public BClass() {
		System.out.println("BClass");
	}
}

class CClass extends AClass{
	public BClass b = new BClass();
}

public class E05_SimpleInheritance {

	public static void main(String[] args) {
		new CClass();
	}

}
