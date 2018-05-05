package test.ThinkinJava.cha7;

public class E02_NewDetergent extends E02_Detergent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_NewDetergent x = new E02_NewDetergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing Class Detergent...");
		E02_Detergent.main(args);
	}

	@Override
	public void scrub() {
		// TODO Auto-generated method stub
		append(" NewDetergent.scrub()");
		super.scrub();
	}

	public void sterillize() {
		append(" sterillize()");
	}
}
