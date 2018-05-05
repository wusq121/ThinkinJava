package test.ThinkinJava.cha7;

class OverridingPrivateE20 extends WithFinals{
	private final void f(){
		System.out.println("OverridingPrivate.f()");
	}
	private void g(){
		System.out.println("OverridingPrivate.g()");
	}
}

class WithFinals{
	private final void f(){
		System.out.println("WithFinals.f()");
	}
	private void g(){
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate2E20 extends OverridingPrivateE20{
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
	public final void f(){
		System.out.println("OverridingPrivate2.f()");
	}
}
public class E20_OverrideAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
		op2.f();
		op2.g();
	}
}
