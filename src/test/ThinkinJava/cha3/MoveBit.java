package test.ThinkinJava.cha3;

public class MoveBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ni = 0x40000000;
		for( ; ni != 0; ni >>= 1)
			System.out.println(Integer.toBinaryString(ni));
		
		char[] a = {'a','b',' ', '²Ë', '7'};
		for (char c : a) {
			System.out.println(Integer.toBinaryString(c));
		}
	}

}
