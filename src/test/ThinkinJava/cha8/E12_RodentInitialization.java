package test.ThinkinJava.cha8;

class Member{
	Member(String id){
		System.out.println("Member constructor " + id);
	}
}

class Rodent2{
	Member m1 = new Member("r1"), m2 = new Member("r2");
	Rodent2(){
		System.out.println("Rodent constructor");
	}
}

class Mouse2 extends Rodent2{
	Member m1 = new Member("m1"), m2 = new Member("m2");
	Mouse2(){
		System.out.println("Mouse constructor");
	}
}

class Gerbil2 extends Rodent2{
	Member m1 = new Member("g1"), m2 = new Member("g2");
	Gerbil2(){
		System.out.println("Gerbil constructor");
	}
}

class Hamster2 extends Rodent2{
	Member m1 = new Member("h1"), m2 = new Member("h2");
	Hamster2() {
		System.out.println("Hamster constructor");
	}
}

public class E12_RodentInitialization {
	public static void main(String[] args) {
		new Hamster2();
	}
}
