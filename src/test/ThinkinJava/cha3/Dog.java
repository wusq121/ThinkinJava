package test.ThinkinJava.cha3;

public class Dog {
	String name;
	String says;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSays() {
		return says;
	}

	public void setSays(String says) {
		this.says = says;
	}

	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
	public void print(){
		System.out.println("this dog's name is:" + this.name + "\nsays:" + this.says);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog("spot", "Ruff!" );
		Dog scruffy = new Dog("scruffy", "Wurf!");
		spot.print();
		scruffy.print();
		Dog dog = spot;
		System.out.println(dog.equals(spot));
		System.out.println(dog == spot);
	}
}
