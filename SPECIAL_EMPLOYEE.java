package ASSIGNMENT_5_PART_2;
public class SPECIAL_EMPLOYEE extends EMPLOYEE
{
	@Override
	public void SalaryCalculation() 
	{
		double BW = ((GetGrosswage() / GetTotalWorkingDays()) * GetPaidDays()) * 0.45;
		SetBasicWage(BW);
		double HRA = (BW * 0.40);
		SetHRA(HRA);
		double CA = (1600 / GetTotalWorkingDays()) * GetPaidDays();
		SetConveyanceAllowances(CA);
		double MA = (1250 / GetTotalWorkingDays()) * GetPaidDays();
		SetMedicalAllowances(MA);
		double OtherAllo = ((GetGrosswage() / GetTotalWorkingDays()) * GetPaidDays()) - (BW + HRA + CA + MA);
		SetTotalEarning(BW + HRA + CA + MA + OtherAllo);
		double ESI = GetTotalEarning() * 0.0075;
		SetTotalEarning(GetTotalEarning() + ESI);
		System.out.println("Total Earnings: " + GetTotalEarning() );
	}
}
