package test.ThinkinJava.cha10;

class Outer3{
	class Inner{
		{System.out.println("Inner created");}
	}
}

public class E05_InstanceOfInner {

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner oi = o.new Inner();
	}
}
