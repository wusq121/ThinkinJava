package test.ThinkinJava.cha3;

public class zhixing {

	public static void main(String[] args) {
		float a, b;
		fuzhi f = new fuzhi(4.0f);
		fuzhi g = f;
		a = 4.0f;
		b = a;
		b = 5.0f;
		System.out.println(a);
		System.out.println(b);
		g.setF(5.0f);
		f.print();
		g.print();
	}

}
