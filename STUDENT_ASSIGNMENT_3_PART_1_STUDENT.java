package ASSIGNMENT_3;
public class STUDENT_ASSIGNMENT_3_PART_1_STUDENT
{
	private int PRN;
	private String Name, DOB; 
	private double Marks; 
	public STUDENT_ASSIGNMENT_3_PART_1_STUDENT(int PRN, String Name, String DOB, double Marks)
	{ 
		super(); 
		this.PRN = PRN; 
		this.Name = Name; 
		this.DOB = DOB; 
		this.Marks = Marks; 
	} 
	public int GetPRN()
	{ 
		return PRN; 
	} 
	public void SetPrn(int PRN)
	{ 
		this.PRN = PRN; 
	} 
	public String GetName()
	{ 
		return Name; 
	} 
	public void SetName(String Name)
	{ 
		this.Name = Name; 
	} 
	public String GetDOB()
	{ 
		return DOB; 
	} 
	public void SetDOB(String DOB)
	{ 
		this.DOB = DOB; 
	}
	public double GetMarks()
	{ 
		return Marks; 
	} 
	public void SetMarks(double Marks)
	{ 
		this.Marks = Marks; 
	} 
	@Override 
	public String toString()
	{ 
		return "PRN = " + PRN + ", Name = " + Name + ", Dob = " + DOB + ", Marks = " + Marks + "\n"; 
	}
}
