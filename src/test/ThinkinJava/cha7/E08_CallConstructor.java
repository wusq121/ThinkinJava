package test.ThinkinJava.cha7;

class BaseNoDefault{
	public BaseNoDefault(int i) {
		// TODO Auto-generated constructor stub
		System.out.println(i);
	}
}

class DerivedTwoConstructor extends BaseNoDefault{
	public DerivedTwoConstructor() {
		// TODO Auto-generated constructor stub
		super(2);
	}
	public DerivedTwoConstructor(int i){
		super(i);
	}
}
public class E08_CallConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DerivedTwoConstructor();
		new DerivedTwoConstructor(3);

	}

}
