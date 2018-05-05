package test.ThinkinJava.cha4;

public class E09_Fibonacci {
	static int[] fibo(int n){
		if (n < 0)
			System.err.println("...");
		int[] fib = new int[n-1];
		for (int i = 0; i < fib.length; i++) {
			if(i == 0||i == 1)
				fib[i] = 1;
			else{
				fib[i] = fib[i-2] + fib[i-1];
			}
		}
		return fib;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = fibo(20);
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
	}

}
