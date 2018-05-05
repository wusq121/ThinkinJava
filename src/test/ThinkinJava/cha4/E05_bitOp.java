package test.ThinkinJava.cha4;

public class E05_bitOp {
	public static void printAsBinaryString(int i){
		char[] buffer = new char[32];
		int pos = 32;
		do{
			buffer[--pos] = ((i&0x1)!=0)?'1':'0';
			i >>>= 1;
		}while(i != 0);
		for(int j = pos; j <32; ++j)
			System.out.print(buffer[j]);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 0xAAAAAAAA;
		int i2 = 0x55555555;
		System.out.println("i1:");
		printAsBinaryString(i1);
		System.out.println("i1^i1:");
		printAsBinaryString(i1^i1);
		System.out.println("i1&i1:");
		printAsBinaryString(i1&i1);
		System.out.println("i1|i1:");
		printAsBinaryString(i1|i1);
		System.out.println("~i1:");
		printAsBinaryString(~i1);
		System.out.println("i2:");
		printAsBinaryString(i2);
		System.out.println("i2^i2:");
		printAsBinaryString(i2^i2);
		System.out.println("i2&i2:");
		printAsBinaryString(i2&i2);
		System.out.println("i2|i2:");
		printAsBinaryString(i2|i2);
		System.out.println("~i2:");
		printAsBinaryString(~i2);
		System.out.println("i1^i2:");
		printAsBinaryString(i1^i2);
		System.out.println("i1&i2:");
		printAsBinaryString(i1&i2);
		System.out.println("i1|i2:");
		printAsBinaryString(i1|i2);
	}

}
