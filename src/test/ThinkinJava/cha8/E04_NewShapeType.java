package test.ThinkinJava.cha8;

class Tetrahedron extends Shape{
	public void draw() {
		System.out.println("Tetrahedron.draw()");
	}
	public void erase() {
		System.out.println("Tetrahedron.erase()");
	}
	public void print() {
		System.out.println("message from Tetrahedron");
	}
}
public class E04_NewShapeType {

	public static void main(String[] args) {
		Shape[] shapes = {
				new Circle(), new Square(), new Triangle(),
				new Tetrahedron()
		};
		
		for(Shape shp : shapes) {
			shp.draw();
			shp.erase();
			shp.print();
		}
	}
}
