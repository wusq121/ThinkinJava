package test.ThinkinJava.cha5;

public class E04_overLoadE03 {
	public E04_overLoadE03() {
		// TODO Auto-generated constructor stub
		System.out.println("����һ��������");
	}
	public E04_overLoadE03(String s){
		System.out.println("����һ��������" + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E04_overLoadE03();
		new E04_overLoadE03("balabala");
	}

}
