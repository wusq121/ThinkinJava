package test.ThinkinJava.cha9;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument{
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public abstract String toString();
}

class Wind extends Instrument{
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument{
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument{
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind{
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind{
	public String toString() {
		return "Woodwind";
	}
}

public class E09_AbstractMusic5 {
	static void tune(Instrument i) {
		i.adjust();
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(), new Percussion(), new Stringed(),
			new Brass(), new Woodwind()
		};
		tuneAll(orchestra);
	}
}
