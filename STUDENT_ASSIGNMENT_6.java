package ASSIGNMENT_6;
public class STUDENT_ASSIGNMENT_6
{
	String Name; 
	int Roll_No; 
	double Mark1, Mark2; 
	public STUDENT_ASSIGNMENT_6(String Name, int Roll_No, double Mark1, double Mark2)
	{ 
		super();
		this.Name = Name; 
		this.Roll_No = Roll_No; 
		this.Mark1 = Mark1; 
		this.Mark2 = Mark2; 
	} 
	@Override 
	public String toString()
	{ 
		return("STUDENT_ASSIGNMENT_6[Name=" + Name + ", Roll_No=" + Roll_No + ", Mark1=" + Mark1 + ", Mark2=" + Mark2 + "]");
	} 
	public String GetName()
	{ 
		return(Name); 
	} 
	public void SetName(String Name) 
	{ 
		this.Name = Name; 
	} 
	public int GetRoll_No()
	{ 
		return(Roll_No); 
	} 
	public void SetRoll_No(int Roll_No)
	{ 
		this.Roll_No = Roll_No; 
	} 
	public double GetMark1()
	{ 
		return(Mark1); 
	} 
	public void SetMark1(double Mark1)
	{
		this.Mark1 = Mark1; 
	} 
	public double GetMark2()
	{ 
		return(Mark2); 
	} 
	public void SetMark2(double Mark2)
	{ 
		this.Mark2 = Mark2; 
	}
}
