package test.ThinkinJava.cha5;

public class E14_StaticStringInitialization {
	static String s1 = "Initialized at definition";
	static String s2;
	static{
		s2 = "Initialized at static block";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}

}
