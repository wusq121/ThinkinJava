package test.ThinkinJava.cha4;

public class E07_print {
	private static void print1() {
		int i = 1;
		for(; i <= 100; ++i){
			System.out.print(i + " ");
			if(i == 99)
				break;
		}
		System.out.println("\nnow i is " + i);
	}
	
	private static boolean print2() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if(i == 99)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1();
		print2();
	}

}
