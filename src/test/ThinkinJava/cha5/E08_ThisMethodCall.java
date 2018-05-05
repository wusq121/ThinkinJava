package test.ThinkinJava.cha5;

public class E08_ThisMethodCall {
	public void b() {
		System.out.println("b() is called");
	}
	public void a() {
		b();
		this.b();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E08_ThisMethodCall().a();
	}

}
