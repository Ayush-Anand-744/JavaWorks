package ASSIGNMENT_3;
import java.util.*;
public class STUDENT_FUNCTIONS_ASSIGNMENT_3_PART_1_STUDENT
{
	ArrayList<STUDENT_ASSIGNMENT_3_PART_1_STUDENT> student = new ArrayList<>();
	Scanner sc = new Scanner(System.in); 
	public void AddStudent()
	{ 
		System.out.print("Enter Number Of Students that you want to Add: "); 
		int NoOfStudents = sc.nextInt(); 
		System.out.println("Enter Student/s:"); 
		for(int i = 0; i < NoOfStudents; i++) 
		{ 
			System.out.print("Enter PRN:"); 
			int PRN = sc.nextInt(); 
			System.out.print("Enter Name:"); 
			String Name = sc.next(); 
			System.out.print("Enter DoB:"); 
			String DOB = sc.next(); 
			System.out.print("Enter Marks:"); 
			double Marks = sc.nextDouble(); 
			STUDENT_ASSIGNMENT_3_PART_1_STUDENT S = new STUDENT_ASSIGNMENT_3_PART_1_STUDENT(PRN, Name, DOB, Marks); 
			student.add(S); 
		} 
	} 
	public void PrintStudentToString() 
	{ 
		System.out.println("-----------Student Details------------"); 
		String List = student.toString(); 
		System.out.println(List); 
	} 
	public void PrintStudentsDetails() 
	{ 
		System.out.println("-----------Student Details------- -----"); 
		System.out.println("PRN\t Name\t DoB\t Marks"); 
		for (int i = 0; i < student.size(); i++) 
		{ 
			PrintStudent(i);
		} 
	} 
	private void PrintStudent(int i) 
	{ 
		System.out.println(student.get(i).GetPRN() + "\t" +  student.get(i).GetName() + "\t" +  student.get(i).GetDOB() + "\t" + student.get(i).GetDOB()); 
	} 
	public void DeleteStudent() 
	{ 
		System.out.print("Enter PRN for Deleting the Student Information: "); 
		int PRN = sc.nextInt(); 
		System.out.println("PRN\t Name\t DoB\t Marks"); 
		for(int i = 0; i < student.size(); i++) 
		{ 
			if(student.get(i).GetPRN() == PRN) 
			{ 
				student.remove(i); 
			} 
			else 
			{ 
				System.out.println("Student does not exist"); 
			} 
		} 
	} 
	public void UpdateStudentPRN() 
	{ 
		System.out.print("Enter PRN for updating the Student Information: ");
		int PRN = sc.nextInt(); 
		//System.out.println("PRN\t Name\t DoB\t Marks"); 
		for(int i = 0; i < student.size(); i++) 
		{ 
			if(student.get(i).GetPRN() == PRN) 
			{ 
				System.out.print("Enter updated Name:"); 
				String Name = sc.next(); 
				System.out.print("Enter updated Dob:"); 
				String DOB = sc.next(); 
				System.out.print("Enter updated Marks:"); 
				double Marks = sc.nextDouble(); 
				student.get(i).SetName(Name); 
				student.get(i).SetDOB(DOB); 
				student.get(i).SetMarks(Marks); 
			} 
			else 
			{ 
				System.out.println("Student Does Not Exist"); 
			} 
		} 
	}

}
