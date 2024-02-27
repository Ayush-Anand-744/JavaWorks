package ASSIGNMENT_5_PART_1;
public class TRIANGLE implements SHAPE
{
double Base, Side1, Side2, Height;
	
	public TRIANGLE(double Base, double Side1, double Side2, double Height)
	{
		super();
		this.Base = Base;
		this.Height = Height;
		this.Side1 = Side1;
		this.Side2 = Side2;
	}

	@Override
	public double AREA()
	{
		// TODO Auto-generated method stub
		return (0.5 * Base * Height);
	}

	@Override
	public double PERIMETER()
	{
		// TODO Auto-generated method stub
		return (Base + Side1 + Side2);
	}

}
