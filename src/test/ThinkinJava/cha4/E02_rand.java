package test.ThinkinJava.cha4;

import java.util.Random;

public class E02_rand {
	static Random random = new Random();
	public static void compareRandom() {
		float a = random.nextFloat();
		float b = random.nextFloat();
		System.out.println("a = " + a + ", b = " + b);
		if(a > b)
			System.out.println("a > b");
		else if (a < b)
			System.out.println("a < b");
		else
			System.out.println("a = b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 25; ++i){
			compareRandom();
		}
	}

}
