package test.ThinkinJava.cha5;

public class E21_EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(E21_money m : E21_money.values())
			System.out.println(m + ", ordinal " + m.ordinal());
		
		System.out.println(E21_money.valueOf("FIFTY"));
	}

}
