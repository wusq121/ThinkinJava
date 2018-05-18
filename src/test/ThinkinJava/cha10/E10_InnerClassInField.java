package test.ThinkinJava.cha10;

public class E10_InnerClassInField {
	public SimpleInterface get() {
		{
			class SI implements SimpleInterface{
				public void f1() {
					System.out.println("SI.f1()");
				}
			}
			return new SI();
		}
	}
	public static void main(String[] args) {
		SimpleInterface si = new E10_InnerClassInField().get();
		si.f1();
	}

}
