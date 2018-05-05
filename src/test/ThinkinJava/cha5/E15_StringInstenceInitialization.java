package test.ThinkinJava.cha5;

public class E15_StringInstenceInitialization {
	String s1;
	{
		s1 = "Initialized at Instence block";
	}
	public E15_StringInstenceInitialization() {
		// TODO Auto-generated constructor stub
		System.out.println(s1);
	}
	public E15_StringInstenceInitialization(String ss){
		System.out.println("before set s1: " + s1 );
		s1 = ss;
		System.out.println("s1: " + s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E15_StringInstenceInitialization();
		new E15_StringInstenceInitialization("xxx");
	}

}
