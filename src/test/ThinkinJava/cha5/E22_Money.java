package test.ThinkinJava.cha5;

public class E22_Money {
	E21_money num;
	public E22_Money(E21_money num){
		this.num = num;
	}
	public void describe(){
		System.out.print("This is ");
		switch (num) {
		case ONE:
			System.out.println("1 yuan!");
			break;
		case FIVE:
			System.out.println("5 yuan!");
			break;
		case TEN:
			System.out.println("10 yuan!");
			break;
		case TWENTY:
			System.out.println("20 yuan!");
			break;
		case FIFTY:
			System.out.println("50 yuan!");
			break;
		case HUNDRED:
			System.out.println("100 yuan!");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E22_Money
		  m1 = new E22_Money(E21_money.ONE),
		  m2 = new E22_Money(E21_money.FIFTY),
		  m3 = new E22_Money(E21_money.TWENTY);
		m1.describe();
		m2.describe();
		m3.describe();
	}

}
