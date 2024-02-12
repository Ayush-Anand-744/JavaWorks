package ASSIGNMENT_1;
import java.util.Scanner;
public class INPUT_ASSIGNMENT_1
{
	public double[] INPUT_NUMBERS() 
	{ 
		try(Scanner sc = new Scanner(System.in))
		{
			double Numbers[] = new double[2]; 
			System.out.println("Enter First Number:"); 
			double First = sc.nextDouble(); 
			System.out.println("Enter Second Number:"); 
			double Second = sc.nextDouble(); 
			Numbers[0] = First; 
			Numbers[1] = Second; 
			return(Numbers);
		}
	}
}
