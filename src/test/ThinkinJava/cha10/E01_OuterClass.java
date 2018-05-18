package test.ThinkinJava.cha10;

public class E01_OuterClass {
	class Inner{
		String name;
		public Inner(String n) {
			name = n;
		}
		public String toString() {
			return name;
		}
	}
	Inner getInner(String n) {
		return new Inner(n);
	}
	public static void main(String[] args) {
		E01_OuterClass o1 = new E01_OuterClass();
		E01_OuterClass o2 = new E01_OuterClass();
		E01_OuterClass.Inner i1 = o1.getInner("wushiqiang");
		E01_OuterClass.Inner i2 = o2.getInner("gaonanxi");
		System.out.println(i1);
		System.out.println(i2);
	}
}
