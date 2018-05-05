package test.ThinkinJava.cha4;

public class E10_Vampire {
	static boolean judge(int num1, int num2){
		if(num1 <10 && num1 >99){
			System.out.println("...num1");
			return false;
		}else if (num2 < 10 && num2 > 99) {
			System.out.println("...num2");
			return false;
		}else {
			int product = num1 * num2;
			int[] digits = new int[4];
			digits[0] = num1 / 10;
			digits[1] = num1 % 10;
			digits[2] = num2 / 10;
			digits[3] = num2 % 10;
			for(int i = 0; i < digits.length; ++i){
				for(int j = 0; j < digits.length; ++j){
					if(j == i) continue;
					for(int k = 0; k < digits.length; ++k){
						if(k == i || k ==j) continue;
						int l = 6 - i - j - k;
						int temp = digits[i]*1000 + digits[j]*100 + digits[k]*10 + digits[l];
						if(temp == product)
							return true;
					}
				}
			}
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num1 = 10; num1 <= 99; ++num1)
			for(int num2 = num1; num2 <= 99; ++num2)
				if (judge(num1, num2)) {
					int p = num1 * num2;
					System.out.println(num1+"*"+num2+": " +p);
				}
	}

}
