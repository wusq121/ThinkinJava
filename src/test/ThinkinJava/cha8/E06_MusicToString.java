package test.ThinkinJava.cha8;

import java.util.Random;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}
class Instrument{
	void play(Note n) {
		System.out.println("Instrument.play()" + n);
	}
	public String toString(){
		return "Instrument";
	}
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument{
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	public String toString() {
		return "Wind";
	}
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument{
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	public String toString() {
		return "Percussion";
	}
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument{
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Woodwind extends Wind{
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	public String toString() {
		return "Woodwind";
	}
}

class Brass extends Wind{
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Music{
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
}

class Piano extends Stringed{
	void play(Note n) {
		System.out.println("Piano.play() " + n);
	}
}

class RandomInstrumentGenerator{
	private Random rand = new Random(47);
	public Instrument next() {
		switch(rand.nextInt(6)) {
			default:
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Woodwind();
			case 4: return new Brass();
			case 5: return new Piano();
		}
	}
}
public class E06_MusicToString {
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

	public static void main(String[] args) {
		Instrument[] orchestra = new Instrument[9];
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		Music.tuneAll(orchestra);
	}

}
