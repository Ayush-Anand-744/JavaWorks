package ASSIGNMENT_1;
import java.util.Scanner;
public class MAIN_1_ASSIGNMENT_1
{
	public static void main(String args[]) 
	{ 
		int Option; 
		INPUT_ASSIGNMENT_1 inp = new INPUT_ASSIGNMENT_1(); 
		CALCULATOR_ASSIGNMENT_1 calc = new CALCULATOR_ASSIGNMENT_1(); 
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("1. ADD\n2. SUBSTRACT\n3. MULTIPLY\n4. DIVIDE\n5. MEAN\n6. SQUARE\n7. SQUARE_ROOT\n8. VARIANCE\n9. EXIT"); 
			System.out.println("Enter:"); 
			Option = sc.nextInt(); 
			switch(Option) 
			{ 
				case 1: 
					double Numbers[] = new double[2]; 
					Numbers = inp.INPUT_NUMBERS(); 
					System.out.println("The addition of " + Numbers[0] + " and " + Numbers[1] + " is " + calc.ADDITION(Numbers [0],Numbers[1])); 
					break; 
				case 2: 
					double Sub_Num[] = new double[2]; 
					Sub_Num = inp.INPUT_NUMBERS(); 
					System.out.println("The subtraction of " + Sub_Num[0] + " and " + Sub_Num[1] + " is " + calc.SUBSTRACTION(Sub_Num[0],Sub_Num[1])); 
					break; 
				case 3: 
					double Multiply_Num[] = new double[2]; 
					Multiply_Num = inp.INPUT_NUMBERS(); 
					System.out.println("The multiplication of " + Multiply_Num[0] + " and " + Multiply_Num[1] + " is " + calc.MULTIPLICATION(Multiply_Num[0], Multiply_Num[1]));
					break; 
				case 4: 
					double Divide_Num[] = new double[2]; 
					Divide_Num = inp.INPUT_NUMBERS(); 
					System.out.println("The multiplication of " + Divide_Num[0] + " and " + Divide_Num[1] + " is " + calc.DIVISION(Divide_Num[0], Divide_Num[1]));
					break; 
				case 5: 
					double Local_Mean = calc.MEAN(); 
					System.out.println("Mean is:" + Local_Mean); 
					break; 
				case 6: 
					System.out.println("Enter the number to be squared:"); 
					double Square_Num = sc.nextDouble(); 
					System.out.println("The square of " + Square_Num + " is " + calc.POWER(Square_Num, 2)); 
					break; 
				case 7: 
					System.out.println("Enter the number:"); 
					double square_root_num = sc.nextDouble(); 
					System.out.println("The square root of " + square_root_num + " is " + calc.POWER(square_root_num, 0.5)); 
					break; 
				case 8: 
					double Local_Variance = calc.VAR(); 
					System.out.println("Variance is:" + Local_Variance); 
					break; 
				case 9: 
					break; 
				default: 
					System.out.println("Error"); 
			}
			sc.close();
		}
	}
}
