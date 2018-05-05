package test.ThinkinJava.cha5;

public class E12_Tank {
	public boolean full = false;
	static int count;
	int id = count++;
	public E12_Tank(){
		System.out.println("Tank is created" + id);
		full = true;
	}
	protected void finalize() {
		if(!full)
			System.out.println("clean up" + id);
		else{
			System.out.println("Error" + id);
		}
	}
	public void empty(){
		full = false;
	}
	public String toString() {
		return "Tank" + id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
