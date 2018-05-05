package test.ThinkinJava.cha4;

import java.util.Scanner;

public class E04_prime {
	public void isPrime1(int i){
		if(i < 2){
			System.out.println("̫С");
		}else {
			System.out.print(2 + " ");
			for(int j = 3; j <= i; ++j ){
				boolean prime = true;
				for(int k = 2; k < j; ++k){
					if(j % k == 0)
						prime = false;
				}
				if(prime)
					System.out.print(j + " ");
			}
		}
		System.out.println();
	}
	
	public void isPrime2(int i){
		if(i < 2)
			System.out.println("too small");
		else {
			boolean[] sieve = new boolean[i + 1];
			System.out.print(2 + " ");
			int lim = (int)Math.floor(Math.sqrt(i));
			for(int j = 2; j <= lim; ++j){
				if(!sieve[j])
					for(int k = 2*j; k <= i; k += j)
						sieve[k] = true;
			}
			for(int j = 3; j <= i; ++j)
				if (!sieve[j]) {
					System.out.print(j + " ");
				}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E04_prime p = new E04_prime();
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		in.close();
		p.isPrime1(i);
		p.isPrime2(i);
	}

}
