package test.ThinkinJava.cha3;

public class PassObject{
	class Letter{
		char c;
	}
	
	static void f(Letter y){
		y.c = 'z';
	}
	public static void main(String[] args){
		PassObject passObject = new PassObject();
		Letter x = passObject.new Letter();
		x.c = 'a';
		System.out.println("1:x.c = " + x.c);
		f(x);
		System.out.println("2:x.c = " + x.c);
	}
}