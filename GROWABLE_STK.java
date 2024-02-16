package ASSIGNMENT_6;
import java.util.*; 
public class GROWABLE_STK implements INTERFACE_STK
{
	ArrayList<Integer> Stack; 
	int Top = -1; 
	public GROWABLE_STK()
	{ 
		Stack = new ArrayList<Integer>(5);
		this.Top = -1; 
	} 
	@Override 
	public void Push(int Element)  
	{ 
		Stack.add(++Top, Element); 
	} 
	@Override 
	public int Pop()
	{ 
		if(Underflow()) 
		{ 
			System.out.println("Stack Is Empty");
		} 
		else 
		{ 
			int Element = Stack.get(Top); 
			Stack.remove(Top--); 
			return(Element); 
		} 
		return(-1); 
	} 
	@Override
	public void DisplayStack()
	{ 
		// TODO Auto-generated method stub 
		for(int x:Stack) 
		{ 
			System.out.print(x + " "); 
		} 
		System.out.println(""); 
	} 
	@Override 
	public boolean Overflow()  
	{ 
		System.out.println("Not Applicable For Growable Stack"); 
		return(false); 
	} 
	@Override 
	public boolean Underflow()  
	{ 
		if (Top == -1) 
		{ 
			return(true); 
		} 
		else 
		{ 
			return(false); 
		} 
	}

}
