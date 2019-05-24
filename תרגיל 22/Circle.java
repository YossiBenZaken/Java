package targil;

public class Circle implements GeometricObject{
	protected double radius = 1.0;
	public Circle(double r)
	{
		radius = r;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
