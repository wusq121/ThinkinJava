package test.ThinkinJava.cha4;

public class E06_RangeTest {
	public static boolean test(int testval, int begin, int end) {
		boolean result = false;
		if(begin > end){
			begin = begin + end;
			end = begin - end;
			begin = begin - end;
		}
		if (testval >= begin && testval <= end)
			result = true;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(7, 4, 8));
		System.out.println(test(7, 8, 4));
	}

}
