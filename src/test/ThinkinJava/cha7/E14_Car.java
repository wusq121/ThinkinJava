package test.ThinkinJava.cha7;

class Engine{
	public void start(){};
	public void rev(){};
	public void stop(){};
	public void service(){
		System.out.println("service");
	}
}
class Window{
	public void rollup(){};
	public void rolldown(){};
}
class Wheel{
	public void inflate(){
	}
}
class Door{
	public Window window = new Window();
	public void open() {
		
	}
	public void close() {
		
	}
}
public class E14_Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door();
	public Door right = new Door();
	public E14_Car(){
		for(int i = 0; i < 4; i++){
			wheel[i] = new Wheel();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E14_Car car = new E14_Car();
		car.engine.service();
	}

}
