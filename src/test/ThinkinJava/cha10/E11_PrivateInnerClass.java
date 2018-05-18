package test.ThinkinJava.cha10;

class Outer5{
	private class Inner implements SimpleInterface{
		public void f1() {
			System.out.println("Outer5.Inner.f1()");
		}
	}
	public SimpleInterface get() {
		return new Inner();
	}
	public Inner get2() {
		return new Inner();
	}
}

public class E11_PrivateInnerClass {

	public static void main(String[] args) {
		Outer5 out = new Outer5();
		SimpleInterface si = out.get();
		si.f1();
		si = out.get2();
		si.f1();
	}

}
