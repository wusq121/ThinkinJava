package test.ThinkinJava.cha5;

public class E17_ObjectReference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E17_Test[] t1 = new E17_Test[5];
		for (int i = 0; i < t1.length; i++) {
			t1[i] = new E17_Test(Integer.toString(i));
		}
	}

}
