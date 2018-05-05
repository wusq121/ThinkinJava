package test.ThinkinJava.cha7;

import java.util.Random;

public class E18_FinalFields {
	private static Random rand = new Random();
	public static final int MAX_MONEY = rand.nextInt(57);
	public final int data = rand.nextInt(77);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E18_FinalFields ff1 = new E18_FinalFields();
		System.out.println(ff1.data + " " + E18_FinalFields.MAX_MONEY);
		E18_FinalFields ff2 = new E18_FinalFields();
		System.out.println(ff2.data + " " + E18_FinalFields.MAX_MONEY);
	}

}
