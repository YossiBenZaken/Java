package targil;

public class Cylinder extends Circle {
	private double height = 1.0;
	public Cylinder() {
		super();
	}
	public Cylinder(double r) {
		super(r);
	}
	public Cylinder(double r,double h) {
		super(r);
		height = h;
	}
	public Cylinder(double r,double h,String c) {
		super(r,c);
		height = h;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double getVolume()
	{
		return super.getArea() * height;
	}
}
