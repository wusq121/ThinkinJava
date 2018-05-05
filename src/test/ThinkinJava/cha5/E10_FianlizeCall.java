package test.ThinkinJava.cha5;

public class E10_FianlizeCall {
	protected void finalize() {
		System.out.println("Fianlize() is called!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E10_FianlizeCall e = new E10_FianlizeCall();
		e.finalize();
	}

}
