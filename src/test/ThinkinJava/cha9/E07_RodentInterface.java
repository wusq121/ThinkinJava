package test.ThinkinJava.cha9;

import test.ThinkinJava.cha9.interfaces.Rodent2;

class Mouse4 implements Rodent2{
	public void hop() {
		System.out.println("Mouse hopping");
	}
	public void scurry() {
		System.out.println("Mouse scurrying");
	}
	public void reproduce() {
		System.out.println("Making more Mice");
	}
	public String toString() {
		return "Mouse";
	}
}

class Gerbil4 implements Rodent2{
	public void hop() {
		System.out.println("Gerbil hopping");
	}
	public void scurry() {
		System.out.println("Gerbil scurrying");
	}
	public void reproduce() {
		System.out.println("Making more Gerbils");
	}
	public String toString() {
		return "Gerbil";
	}
}

class Hamster4 implements Rodent2{
	public void hop() {
		System.out.println("Hamster hopping");
	}
	public void scurry() {
		System.out.println("Hamster scurrying");
	}
	public void reproduce() {
		System.out.println("Making more Hamsters");
	}
	public String toString() {
		return "Hamster";
	}
}
public class E07_RodentInterface {

	public static void main(String[] args) {
		Rodent2[] rodents = {
			new Mouse4(), new Gerbil4(), new Hamster4()
		};
		for(Rodent2 r : rodents) {
			r.hop();
			r.scurry();
			r.reproduce();
			System.out.println(r);
		}
	}
}
