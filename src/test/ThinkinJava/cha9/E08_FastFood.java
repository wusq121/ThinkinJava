package test.ThinkinJava.cha9;

import test.ThinkinJava.cha9.interfaces.FastFood;

class FastSandwich implements FastFood{
	public void rushOrder() {
		System.out.println("Rushing your sandwich order");;
	}
	public void gobble() {
		System.out.println("Chomp! Snort! Gobble!");
	}
}

public class E08_FastFood {

	public static void main(String[] args) {
		FastSandwich burger = new FastSandwich();
		System.out.println("Fires with that?");
		System.out.println("Super Size?");
		burger.rushOrder();
		burger.gobble();
	}

}
