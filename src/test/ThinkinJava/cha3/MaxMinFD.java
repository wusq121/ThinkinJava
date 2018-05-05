package test.ThinkinJava.cha3;

public class MaxMinFD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		
		System.out.println(fmax);
		System.out.println(fmin);
		System.out.println(dmax);
		System.out.println(dmin);
		
		int n1 = 0xAAAA;
		int n2 = 0x5555;
		System.out.println("n1 :" + Integer.toBinaryString(n1));
		System.out.println("n2 :" + Integer.toBinaryString(n2));
		
		System.out.println("n1&n2 = " + Integer.toBinaryString(n1&n2));
		System.out.println("n1|n2 = " + Integer.toBinaryString(n1|n2));
		System.out.println("n1^n2 = " + Integer.toBinaryString(n1^n2));
		System.out.println("~n1 = " + Integer.toBinaryString(~n1));
		System.out.println("~n2 = " + Integer.toBinaryString(~n2));
	}

}
