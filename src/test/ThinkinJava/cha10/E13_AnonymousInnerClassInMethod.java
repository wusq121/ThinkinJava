package test.ThinkinJava.cha10;

public class E13_AnonymousInnerClassInMethod {
	public SimpleInterface get() {
		return new SimpleInterface() {
			public void f1() {
				System.out.println("SimpleInterface.f1()");
			}
		};
	}
	public static void main(String[] args) {
		SimpleInterface si = new E13_AnonymousInnerClassInMethod().get();
		si.f1();
	}
}
