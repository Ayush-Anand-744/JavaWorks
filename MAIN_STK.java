package ASSIGNMENT_6;
import java.util.*;
public class MAIN_STK
{
	public static void main(String[] args) 
	{ 
		int Stack[] = new int[5]; 
		int T = -1; 
		ArrayList<Integer> StackArray = new ArrayList<Integer >(); 
		INTERFACE_STK FIX_STK = new FIXED_STK(Stack, T);
		System.out.println("Fixed Stack"); 
		FIX_STK.Push(1); 
		FIX_STK.Push(2); 
		FIX_STK.Push(3); 
		FIX_STK.Push(4); 
		FIX_STK.DisplayStack(); 
		System.out.println(); 
		FIX_STK.Pop(); 
		FIX_STK.DisplayStack(); 
		System.out.println("Growable Stack:"); 
		GROWABLE_STK Grow_stk = new GROWABLE_STK(); 
		Grow_stk.Push(1); 
		Grow_stk.Push(2); 
		Grow_stk.Push(3); 
		Grow_stk.Push(4); 
		Grow_stk.Push(5); 
		Grow_stk.Push(6); 
		Grow_stk.DisplayStack(); 
		System.out.println(); 
		Grow_stk.Pop(); 
		Grow_stk.DisplayStack(); 
	}

}
