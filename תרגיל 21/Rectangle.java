package targil;

public class Rectangle extends Shape{
	protected double width,length;
	public Rectangle() {
		
	}
	public Rectangle(double width,double length)
	{
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width,double length,String Color,boolean filled) {
		super(Color,filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double l)
	{
		length = l;
	}
	@Override
	public double getArea() {
		return length*width;
	}
	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}
	@Override
	public String toString() {
		return "Rectangle Width= "+width+" Length= "+length;
	}
}
