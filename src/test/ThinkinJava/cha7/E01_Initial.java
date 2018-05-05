package test.ThinkinJava.cha7;

class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}
	
}
public class E01_Initial {

	private String
		s1 = "Happy",
		s2 = "Happy",
		s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	public E01_Initial(){
		System.out.println("Inside E01_Initial()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	{ i = 47;}
	public String toString(){
		if(s4 == null)
			s4 = "Joy";
		return
			"s1 = " + s1 + "\n" +
			"s2 = " + s2 + "\n" +
			"s3 = " + s3 + "\n" +
			"s4 = " + s4 + "\n" +
			"i = " + i + "\n" +
			"toy = " + toy + "\n" +
			"castille = " + castille;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E01_Initial b = new E01_Initial();
		System.out.println(b);
	}
}
