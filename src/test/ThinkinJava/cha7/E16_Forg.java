package test.ThinkinJava.cha7;

class Amphibian{
	void f(Amphibian p){
		System.out.println("Amphibian.f()");
	}
	void g(Amphibian p){
		System.out.println("Amphibian.g()");
	}
}

class Forg extends Amphibian{
	void f(Amphibian p){
		System.out.println("Forg.f()");
	}
}
public class E16_Forg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forg f = new Forg();
		f.f(f);
		f.g(f);
	}
}
