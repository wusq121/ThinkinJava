package test.ThinkinJava.cha7;
class ThreeOverloads{
	public void f(int i){
		System.out.println("f(int i)");
	}
	public void f(char c){
		System.out.println("f(char c)");
	}
	public void f(double d){
		System.out.println("f(double d)");
	}
}

class MoreOverloads extends ThreeOverloads{
	public void f(String s){
		System.out.println("f(String s)");
	}
}
public class E13_InheriteOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreOverloads mo = new MoreOverloads();
		mo.f('x');
		mo.f(2.1);
		mo.f(1);
		mo.f("xxx");
	}
}
