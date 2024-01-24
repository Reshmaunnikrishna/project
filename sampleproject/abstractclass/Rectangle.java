package abstractclass;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		Shape obj=new Rectangle();
		obj.draw();
		Shape obj1=new Circle();
		obj1.draw();
	}
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}

}
