package Assignment2;
import java.util.*;
public class Parts
{
	public void part1(int[] data) 
	{ 
		int len = data.length; 
		int[] evenArray = new int[len]; 
		int[] oddArray = new int[len]; 
		int evenCount = 0, oddCount = 0; 
		for(int i = 0; i < len; i++) 
		{ 
			if(data[i] % 2 == 0) 
			{ 
				evenArray[evenCount] = data[i]; 
				evenCount++; 
			} 
			else 
			{ 
				oddArray[oddCount] = data[i]; 
				oddCount++;
			} 
		} 
		System.out.println("Original Array: "); 
		for(int i = 0; i < len; i++) 
		{ 
			System.out.println(data[i]); 
		} 
		System.out.println("Even numbers: "); 
		for(int i = 0; i < evenCount; i++) 
		{ 
			System.out.println(evenArray[i]); 
		} 
		System.out.println("Odd numbers: "); 
		for(int i = 0; i < oddCount; i++) 
		{ 
			System.out.println(oddArray[i]); 
		} 
	} 
	public int part2(int[] data) 
	{ 
		int dataLen = data.length, min = 99999999, minIndexVal = -1; 
		int[] differences = new int[dataLen - 1]; 
		for(int i = 0; i < dataLen - 1; i++) 
		{ 
			differences[i] = data[i + 1] - data[i];
		} 
		for (int i = 0; i < differences.length; i++) 
		{ 
			if(differences[i] < min && differences[i] != 0) { 
				min = differences[i]; 
				minIndexVal = i; 
			} 
		} 
		return minIndexVal; 
	} 
	public ArrayList<Integer> part3() 
	{ 
		Scanner sc = new Scanner(System.in); 
		ArrayList<Integer> data = new ArrayList<Integer>(); 
		System.out.print("Enter number of elements you want t o add in array: "); 
		int size = sc.nextInt(); 
		for(int i = 0; i < size; i++) 
		{ 
			System.out.print("Enter data number " + (i + 1) + ": "); 
			data.add(sc.nextInt()); 
		}
		sc.close();
		return data; 
	}
}
