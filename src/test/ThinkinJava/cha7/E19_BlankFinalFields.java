package test.ThinkinJava.cha7;

class WithBlankFinalField{
	private final Integer i;
	
	public WithBlankFinalField(int ii){
		i = new Integer(ii);
	}
	
	public Integer geti(){
		return i;
	}
}
public class E19_BlankFinalFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithBlankFinalField wbff = new WithBlankFinalField(10);
		System.out.println(wbff.geti());
	}

}
