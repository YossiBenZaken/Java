package targil;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		ResizableCircle c = new ResizableCircle(c1.radius);
		System.out.println(c.resize(1000));
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
	}

}
