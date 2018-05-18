package test.ThinkinJava.cha10;

interface SimpleInterface{
	void f1();
}

public class E09_InnerClassInMethed {
	public SimpleInterface get() {
		class SI implements SimpleInterface{
			public void f1() {
				System.out.println("SI.f1()");
			}
		}
		return new SI();
	}
	public static void main(String[] args) {
		SimpleInterface si = new E09_InnerClassInMethed().get();
		si.f1();
	}
}
