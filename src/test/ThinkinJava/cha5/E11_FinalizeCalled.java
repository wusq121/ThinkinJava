package test.ThinkinJava.cha5;

public class E11_FinalizeCalled {
	protected void finalize() {
		System.out.println("finalize() is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E11_FinalizeCalled();
		System.gc();
		System.runFinalization();
	}

}
