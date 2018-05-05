package test.ThinkinJava.cha7;

class E02_Cleanser{
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	@Override
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		E02_Cleanser x = new E02_Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
 	}
}
public class E02_Detergent extends E02_Cleanser{

	@Override
	public void scrub() {
		// TODO Auto-generated method stub
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam() {
		append(" foam()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_Detergent x = new E02_Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		E02_Cleanser.main(args);
	}

}
