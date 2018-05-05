package test.ThinkinJava.cha7;
class Detergent{
	private E02_Detergent detergent = new E02_Detergent();

	public void append(String a) {
		detergent.append(a);
	}

	public void dilute() {
		detergent.dilute();
	}

	public void apply() {
		detergent.apply();
	}

	public String toString() {
		return detergent.toString();
	}

	public void scrub() {
		detergent.scrub();
	}

	public void foam() {
		detergent.foam();
	}

}

public class E11_Detergent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
	}

}
