package ASSIGNMENT_5_PART_1;
public class RECTANGLE implements SHAPE
{
	double Length, Width;

	public RECTANGLE(double Length, double Width)
	{
		super();
		this.Length = Length;
		this.Width = Width;
	}
	@Override
	public double AREA()
	{
		// TODO Auto-generated method stub
		return (Length * Width);
	}
	@Override
	public double PERIMETER()
	{
		// TODO Auto-generated method stub
		return (2 * (Length + Width));
	}
}
