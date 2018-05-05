package test.ThinkinJava.cha6;
import test.ThinkinJava.cha2.*;
import test.ThinkinJava.cha3.*;
public class E02_SameClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowProperties.main(null);
		Coins.main(null);
		test.ThinkinJava.cha2.Hello hello1 = new test.ThinkinJava.cha2.Hello();
		hello1.greeting("wushiqiang!");
		test.ThinkinJava.cha3.Hello hello2 = new test.ThinkinJava.cha3.Hello();
		hello2.greeting("wushiqiang!");
	}
}
