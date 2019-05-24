package targil;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double r)
	{
		super(r);
	}
	@Override
	public double resize(int percent)
	{
		return super.radius * (percent/100);
	}
}
