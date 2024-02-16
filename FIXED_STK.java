package ASSIGNMENT_6;

public class FIXED_STK implements INTERFACE_STK
{
	private int Stack[] = new int[5]; 
	int Top = -1; 
	public FIXED_STK(int[] Stack, int Top)
	{
		super(); 
		this.Stack = Stack; 
		this.Top = Top; 
	} 
	@Override 
	public void Push(int Element)
	{ 
		// TODO Auto-generated method stub 
		if(Overflow()) 
		{ 
			System.out.println("Stack Is Full"); 
		} 
		else 
		{ 
			Stack[++Top] = Element; 
		} 
	}
	@Override 
	public int Pop() 
	{ 
		// TODO Auto-generated method stub 
		if(Underflow()) 
		{ 
			System.out.println("Stack is empty");
			return(-1); 
		} 
		else 
		{ 
			return(Stack[Top--]); 
		} 
	} 
	@Override 
	public void DisplayStack()
	{ 
		// TODO Auto-generated method stub 
		if(Underflow()) 
		{ 
			System.out.println("Stack Is Empty");
		} 
		for(int i = 0; i <= Top; i++) 
		{ 
			System.out.println(Stack[i]); 
		} 
	} 
	@Override 
	public boolean Overflow()
	{ 
		// TODO Auto-generated method stub
		if (Top == (Stack.length-1)) 
		{ 
			return(true);
		} 
		else 
		{ 
			return(false); 
		} 
	} 
	@Override 
	public boolean Underflow()
	{ 
		// TODO Auto-generated method stub 
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
