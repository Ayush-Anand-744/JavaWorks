package ASSIGNMENT_1;
import java.util.*;
public class CALCULATOR_ASSIGNMENT_1
{
	Scanner sc = new Scanner(System.in); 
	public double ADDITION(double First, double Second)
	{ 
		return(First + Second); 
	} 
	public double SUBSTRACTION(double First, double Second)
	{ 
		return(First - Second); 
	} 
	public double MULTIPLICATION(double First, double Second)
	{ 
		return(First * Second);
	}
	public double DIVISION(double First, double Second)
	{ 
		return(First / Second); 
	} 
	public double POWER(double First, double Second)
	{ 
		return Math.pow(First, Second); 
	} 
	public double MEAN() 
	{ 
		String Str; 
		int Ctr = 0;
		double Result = 0, No; 
		do 
		{ 
			System.out.println("Enter Data:"); 
			Str = sc.next(); 
			if(Str.equals("end")) 
			{ 
				break; 
			} 
			else 
			{ 
				No = Double.parseDouble(Str); 
				Result += No; 
				Ctr++; 
			} 
		}while(true); 
		return(Result/Ctr); 
	} 
	public double VAR() 
	{ 
		System.out.println("Enter size of array:"); 
		int Size = sc.nextInt(); 
		double Var_Num[] = new double[Size]; 
		double Var_Sum = 0, Var_Num_Num = 0, Variance_Numerator = 0, Variance = 0; 
		for(int i = 0; i < Size; i++) 
		{ 
			System.out.println("Enter value " + (i + 1) + ":"); 
			Var_Num[i] = sc.nextDouble(); 
			Var_Sum += Var_Num[i]; 
			Var_Num_Num++; 
		}
		double Var_Mean = Var_Sum/Var_Num_Num; 
		for(int i = 0; i < Size; i++) 
		{ 
			Variance_Numerator += POWER(Var_Num[i] - Var_Mean, 2); 
		} 
		Variance = Variance_Numerator / Size; 
		return(Variance); 
	}
}
