package ASSIGNMENT_5_PART_1;
public class CIRCLE implements SHAPE
{
	double Radius;
	public CIRCLE(double Radius) 
	{
		super();
		this.Radius = Radius;
	}
	@Override
	public double AREA()
	{
		// TODO Auto-generated method stub
		return (Math.PI * Radius * Radius);
		
	}

	@Override
	public double PERIMETER()
	{
		// TODO Auto-generated method stub
		return (2 * Math.PI * Radius);
	}
}
