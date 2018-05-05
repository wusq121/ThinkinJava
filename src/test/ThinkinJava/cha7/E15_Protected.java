package test.ThinkinJava.cha7;

class E15_Base{
	protected void f(){
		System.out.println("f()");
	}
}

class E15_Derived extends E15_Base{
	public void g() {
		f();
	}
}

public class E15_Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E15_Base().f();
		new E15_Derived().g();
	}
}
