package test.ThinkinJava.cha9;

abstract class NoMethod{}

class Extended1 extends NoMethod{
	public void f() {
		System.out.println("Extended1.f");
	}
}

abstract class WithMethods{
	abstract void f();
}

class Extened2 extends WithMethods{
	public void f() {
		System.out.println("Extended2.f");
	}
}

public class E04_AbstractBase {
	public static void test1(NoMethod nm) {
		((Extended1)nm).f();
	}
	public static void test2(WithMethods wm) {
		wm.f();
	}
	public static void main(String args[]) {
		NoMethod nm = new Extended1();
		test1(nm);
		WithMethods wm = new Extened2();
		test2(wm);
	}
}
