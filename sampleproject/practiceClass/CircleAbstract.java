package practiceClass;

public class CircleAbstract extends ShapeAbstract {

	public static void main(String[] args) {
		ShapeAbstract obj = new CircleAbstract();
		obj.draw();

	}

	public void draw() {
		System.out.println("Drawing circle");
	}

}
