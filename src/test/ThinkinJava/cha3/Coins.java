package test.ThinkinJava.cha3;

import java.util.Random;

public class Coins {
	String[] reStrings = {"cross", "pile"};
	
	public void print(int index) {
		System.out.println(reStrings[index]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coins coins = new Coins();
		Random rand = new Random();
		int  i = rand.nextInt(2);
		coins.print(i);
 	}

}
