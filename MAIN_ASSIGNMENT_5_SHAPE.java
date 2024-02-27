package ASSIGNMENT_5_PART_1;
public class MAIN_ASSIGNMENT_5_SHAPE
{
	public static void main(String[] args) 
	{
		
		CIRCLE Circle = new CIRCLE(7);
		TRIANGLE Triangle = new TRIANGLE(3, 5, 7, 5);
		RECTANGLE Rectangle = new RECTANGLE(7,3);
		System.out.printf("Circle Perimeter: %.2f\n", Circle.PERIMETER());
		System.out.printf("Circle Area: %.2f\n", Circle.AREA());
		System.out.println();
		System.out.printf("Triangle Perimeter: %.2f\n", Triangle.PERIMETER());
		System.out.printf("Triangle Area: %.2f\n", Triangle.AREA());
		System.out.println();
		System.out.printf("Rectangle Perimeter: %.2f\n", Rectangle.PERIMETER());
		System.out.printf("Rectangle Area: %.2f\n", Rectangle.AREA());
	}
}
