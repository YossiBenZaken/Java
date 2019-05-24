package targil;

public class Square extends Rectangle {
	public Square() {
		
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side,String Color,boolean filled) {
		super(side,side,Color,filled);
	}
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side)
	{
		setLength(side);
		setWidth(side);
	}
	@Override
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	@Override
	public void setLength(double side)
	{
		super.setLength(side);
	}
	@Override
	public String toString() {
		return "Square S= "+ super.getArea()+" P="+super.getPerimeter();
	}
}
