package test.ThinkinJava.cha8;

class Unicycle3 extends Cycle{
	public void balance() {}
}

class Bicycle3 extends Cycle{
	public void balance() {}
}

class Tricycle3 extends Cycle{
	
}

public class E17_Cycle {

	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] {
			new Unicycle3(), new Bicycle3(), new Tricycle3() 
		};
		((Unicycle3)cycles[0]).balance();
		((Bicycle3)cycles[1]).balance();
		//((Unicycle3)cycles[2]).balance();
	}

}
