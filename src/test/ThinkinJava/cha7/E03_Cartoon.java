package test.ThinkinJava.cha7;
class Art {
	Art() {
		// TODO Auto-generated constructor stub
		System.out.println("Art constructor");
	}
}
class Drawing extends Art{
	public Drawing() {
		// TODO Auto-generated constructor stub
		System.out.println("Drawing constructor");
	}
}
public class E03_Cartoon extends Drawing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E03_Cartoon cartoon = new E03_Cartoon();
		System.out.println(cartoon);
	}

}
