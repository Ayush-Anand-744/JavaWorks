package Assignment2;
import java.util.Scanner;
public class Input
{
	public int[] inputData()  
	{ 
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter Size of an array: "); 
			int size = sc.nextInt(); 
			int data[] = new int[size]; 
			for(int i = 0; i < size; i++) 
			{ 
				System.out.print("Enter the data number " + (i + 1) + ": "); 
				data[i] = sc.nextInt(); 
			} 
			return data; 
		}
	}
}
