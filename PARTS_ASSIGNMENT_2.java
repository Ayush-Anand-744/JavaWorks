package ASSIGNMENT_2;
import java.util.ArrayList;
import java.util.Scanner;
public class PARTS_ASSIGNMENT_2
{
	public void PART1(int[] Data) 
	{ 
		int Len = Data.length; 
		int[] EvenArray = new int[Len]; 
		int[] OddArray = new int[Len]; 
		int EvenCount = 0, OddCount = 0; 
		for(int i = 0; i < Len; i++) 
		{	 
			if(Data[i] % 2 == 0) 
			{ 
				EvenArray[EvenCount] = Data[i]; 
				EvenCount++; 
			} 
			else 
			{ 
				OddArray[OddCount] = Data[i]; 
				OddCount++;
			} 
		} 
		System.out.println("Original Array: "); 
		for(int i = 0; i < Len; i++) 
		{ 
			System.out.println(Data[i]); 
		} 
		System.out.println("Even numbers: "); 
		for(int i = 0; i < EvenCount; i++) 
		{ 
			System.out.println(EvenArray[i]); 
		} 
		System.out.println("Odd numbers: "); 
		for(int i = 0; i < OddCount; i++) 
		{ 
			System.out.println(OddArray[i]); 
		} 
	} 
	public int PART2(int[] Data) 
	{ 
		int DataLen = Data.length, Min = 99999999, MinIndexVal = -1; 
		int[] Differences = new int[DataLen - 1]; 
		for(int i = 0; i < DataLen - 1; i++) 
		{ 
			Differences[i] = Data[i + 1] - Data[i];
		} 
		for (int i = 0; i < Differences.length; i++) 
		{ 
			if(Differences[i] < Min && Differences[i] != 0)
			{ 
				Min = Differences[i]; 
				MinIndexVal = i; 
			} 
		} 
	return(MinIndexVal); 
	} 
	public ArrayList<Integer> PART3() 
	{ 
		try(Scanner sc = new Scanner(System.in))
		{
			ArrayList<Integer> data = new ArrayList<Integer>(); 
			System.out.print("Enter number of elements you want t o add in array: "); 
			int Size = sc.nextInt(); 
			for(int i = 0; i < Size; i++) 
			{ 
				System.out.print("Enter data number" + (i + 1) + ":"); 
				data.add(sc.nextInt()); 
			} 
			return data;
		}
	}
}
