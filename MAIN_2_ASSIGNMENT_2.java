package ASSIGNMENT_2;
import java.util.*;
public class MAIN_2_ASSIGNMENT_2
{
	public static void main(String[] args)  
	{ 
		INPUT_ASSIGNMENT_2 inp = new INPUT_ASSIGNMENT_2(); 
		int[] Data = inp.INPUT_DATA(); 
		PARTS_ASSIGNMENT_2 part = new PARTS_ASSIGNMENT_2(); 
		part.PART1(Data); 
		int IndexVal = part.PART2(Data); 
		System.out.println("The index value of the first numb er which has the smallest distance to it's next neighbor is:" + IndexVal); 
		ArrayList<Integer> ArrayList = part.PART3(); 
		System.out.println("Array List:" + ArrayList);
	}
}
