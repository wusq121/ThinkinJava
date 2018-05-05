package test.ThinkinJava.cha5;

public class E12_TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E12_Tank().empty();
		new E12_Tank();
		System.gc();
		System.runFinalization();
	}
}
