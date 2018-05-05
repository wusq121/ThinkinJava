package test.ThinkinJava.cha9;

interface Instrument2{
	void adjust();
}
interface Playable{
	void play(Note n);
}

class Wind2 implements Instrument2, Playable{
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public String toString() {
		return "Wind";
	}
}

class Percussion2 implements Instrument2, Playable{
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public String toString() {
		return "Percussion";
	}
}

class Stringed2 implements Instrument2, Playable{
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public String toString() {
		return "Stringed";
	}
}

class Brass2 extends Wind2{
	public String toString() {
		return "Brass";
	}
}

class Woodwind2 extends Wind2{
	public String toString() {
		return "Woodwind";
	}
}
public class E10_PlayableMusic5 {
	static void tune(Playable p) {
		p.play(Note.MIDDLE_C);
	}
	static void tuneAll(Playable[] e) {
		for(Playable p : e)
			tune(p);
	}
	public static void main(String[] args) {
		Playable[] orchestra = {
				new Wind2(), new Percussion2(), new Stringed2(),
				new Brass2(), new Woodwind2()
			};
			tuneAll(orchestra);
	}
}
