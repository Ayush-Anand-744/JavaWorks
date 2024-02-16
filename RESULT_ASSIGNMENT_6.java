package ASSIGNMENT_6;
public class RESULT_ASSIGNMENT_6 extends STUDENT_ASSIGNMENT_6 implements EXAM
{
	double percentage; 
	public RESULT_ASSIGNMENT_6(String Name, int Roll_No, double Mark1, double Mark2)
	{ 
		super(Name, Roll_No, Mark1, Mark2); 
		// TODO Auto-generated constructor stub 
	} 
	@Override 
	public void Percent_Cal()
	{ 
		// TODO Auto-generated method stub
		this.percentage = (Mark1 + Mark2)/2; 
	} 
	public String Display() 
	{ 
		Percent_Cal(); 
		return(toString()); 
	} 
	@Override 
	public String toString()
	{ 
		return("Result [Percentage=" + percentage + ", Name=" + Name + ", Roll_no=" + Roll_No + ", Mark1=" + Mark1 + ", Mark2=" + Mark2 + "]"); 
	}

}
