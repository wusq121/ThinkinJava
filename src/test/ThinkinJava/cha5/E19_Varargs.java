package test.ThinkinJava.cha5;

public class E19_Varargs {
	
	public static void print(String...args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("xxx","yyy","zzz");
		print(new String[]{"xxx","zzz","yyy"});
	}

}
