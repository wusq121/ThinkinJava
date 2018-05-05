package test.ThinkinJava.cha8;

class Rodent{
	void hop() {
		System.out.println("Rodent hopping");
	}
	void scurry() {
		System.out.println("Rodent scurrying");
	}
	void reproduce() {
		System.out.println("Making more Rodents");
	}
	public String toString() {
		return "Rodent";
	} 
}

class Mouse extends Rodent{
	void hop() {
		System.out.println("Mouse hopping");
	}
	void scurry() {
		System.out.println("Mouse scurrying");
	}
	void reproduce() {
		System.out.println("Making more Mice");
	}
	public String toString() {
		return "Mouse";
	}
}

class Gerbil extends Rodent{
	void hop() {
		System.out.println("Gerbil hopping");
	}
	void scurry() {
		System.out.println("Gerbil scurrying");
	}
	void reproduce() {
		System.out.println("Making more Gerbils");
	}
	public String toString() {
		return "Gerbil";
	}
}

class Hamster extends Rodent{
	void hop() {
		System.out.println("Hamster hopping");
	}
	void scurry() {
		System.out.println("Hamster scurrying");
	}
	void reproduce() {
		System.out.println("Making more Hamster");
	}
	public String toString() {
		return "Hamster";
	}
}

public class E09_Rodent {

	public static void main(String[] args) {
		Rodent[] rodents = {
			new Mouse(),
			new Gerbil(),
			new Hamster()
		};
		for(Rodent r : rodents) {
			r.hop();
			r.scurry();
			r.reproduce();
			System.out.println(r);
		}
	}

}
