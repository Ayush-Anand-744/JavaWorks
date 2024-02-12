package ASSIGNMENT_2;
import java.util.Scanner;
public class INPUT_ASSIGNMENT_2
{
	public int[] INPUT_DATA()  
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Size of an array:"); 
		int Size = sc.nextInt(); 
		int Data[] = new int[Size]; 
		for(int i = 0; i < Size; i++) 
		{ 
			System.out.print("Enter the data number " + (i + 1) + ":"); 
			Data[i] = sc.nextInt(); 
		}
		sc.close();
		return(Data); 
	}
}
