package ASSIGNMENT_5_PART_2;
import java.util.Scanner;
public abstract class EMPLOYEE
{
	Scanner sc = new Scanner(System.in);
    private String EmpName,EmpAddress,EmpDesignation,EmpDept,DOJ,BankName;
    private long UAN,PF_NO,ESINo,EmpId,BankAcctNo;
    private int TotalWorkingDays,PaidDays,LeavesTaken,LopDays;
    private double Grosswage,TotalEarning,TotalDeductions,BasicWage,HRA,ConveyanceAllowances,
            MedicalAllowances,OtherAllowances,EPF,ESI,PT,LoanRecovery;

    public String GetEmpName()
    {
        return EmpName;
    }
    public void SetEmpName(String EmpName)
    {
        this.EmpName = EmpName;
    }
    public String GetEmpAddress()
    {
        return EmpAddress;
    }
    public void SetEmpAddress(String EmpAddress)
    {
        this.EmpAddress = EmpAddress;
    }

    public String GetEmpDesignation()
    {
        return EmpDesignation;
    }
    public void SetEmpDesignation(String EmpDesignation)
    {
        this.EmpDesignation = EmpDesignation;
    }
    public String GetEmpDept()
    {
        return EmpDept;
    }
    public void SetEmpDept(String EmpDept)
    {
        this.EmpDept = EmpDept;
    }
    public String GetDOJ()
    {
        return DOJ;
    }
    public void SetDOJ(String DOJ)
    {
        this.DOJ = DOJ;
    }
    public String GetBankName()
    {
        return BankName;
    }
    public void SetBankName(String BankName)
    {
        this.BankName = BankName;
    }
    public long GetUAN()
    {
        return UAN;
    }
    public void SetUAN(long UAN)
    {
        this.UAN = UAN;
    }
    public long GetPF_NO()
    {
        return PF_NO;
    }
    public void SetPF_NO(long PF_NO)
    {
        this.PF_NO = PF_NO;
    }
    public long GetESINo()
    {
        return ESINo;
    }
    public void SetESINo(long ESINo)
    {
        this.ESINo = ESINo;
    }
    public long GetEmpId()
    {
        return EmpId;
    }
    public void SetEmpId(long EmpId)
    {
        this.EmpId = EmpId;
    }
    public long GetBankAcctNo()
    {
        return BankAcctNo;
    }
    public void SetBankAcctNo(long BankAcctNo)
    {
        this.BankAcctNo = BankAcctNo;
    }
    public int GetTotalWorkingDays()
    {
        return TotalWorkingDays;
    }
    public void SetTotalWorkingDays(int TotalWorkingDays)
    {
        this.TotalWorkingDays = TotalWorkingDays;
    }
    public int GetPaidDays()
    {
        return PaidDays;
    }
    public void SetPaidDays(int PaidDays)
    {
        this.PaidDays = PaidDays;
    }
    public int GetLeavesTaken()
    {
        return LeavesTaken;
    }
    public void SetLeavesTaken(int LeavesTaken)
    {
        this.LeavesTaken = LeavesTaken;
    }
    public int GetLopDays()
    {
        return LopDays;
    }
    public void SetLopDays(int LopDays)
    {
        this.LopDays = LopDays;
    }
    public double GetGrosswage()
    {
        return Grosswage;
    }
    public void SetGrosswage(double Grosswage)
    {
        this.Grosswage = Grosswage;
    }
    public double GetTotalEarning()
    {
        return TotalEarning;
    }
    public void SetTotalEarning(double TotalEarning)
    {
        this.TotalEarning = TotalEarning;
    }
    public double GetTotalDeductions()
    {
        return TotalDeductions;
    }
    public void SetTotalDeductions(double TotalDeductions)
    {
        this.TotalDeductions = TotalDeductions;
    }
    public double GetBasicWage()
    {
        return BasicWage;
    }
    public void SetBasicWage(double BasicWage)
    {
        this.BasicWage = BasicWage;
    }
    public double GetHRA()
    {
        return HRA;
    }
    public void SetHRA(double HRA)
    {
        this.HRA = HRA;
    }
    public double GetConveyanceAllowances()
    {
        return ConveyanceAllowances;
    }
    public void SetConveyanceAllowances(double ConveyanceAllowances)
    {
        this.ConveyanceAllowances = ConveyanceAllowances;
    }
    public double GetMedicalAllowances()
    {
        return MedicalAllowances;
    }
    public void SetMedicalAllowances(double MedicalAllowances)
    {
        this.MedicalAllowances = MedicalAllowances;
    }
    public double GetOtherAllowances()
    {
        return OtherAllowances;
    }
    public void SetOtherAllowances(double OtherAllowances)
    {
        this.OtherAllowances = OtherAllowances;
    }
    public double GetEPF()
    {
        return EPF;
    }
    public void SetEPF(double EPF)
    {
        this.EPF = EPF;
    }
    public double GetEsi()
    {
        return ESI;
    }
    public void SetEsi(double ESI)
    {
        this.ESI = ESI;
    }
    public double GetPT()
    {
        return PT;
    }
    public void SetPT(double PT) {
        this.PT = PT;
    }
    public double GetLoanRecovery()
    {
        return LoanRecovery;
    }
    public void SetLoanRecovery(double LoanRecovery)
    {
        this.LoanRecovery = LoanRecovery;
    }
    
    public abstract void SalaryCalculation();

    public void GetEmployeeDetails()
    {
        System.out.println("Employee Id");
        long EID=sc.nextLong();
        SetEmpId(EID);
        System.out.println("Employee Name");
        String EName=sc.next();
        SetEmpName(EName);
        System.out.println("Employee Designation");
        String D = sc.next();
        SetEmpDesignation(D);
        System.out.println("Employee Department");
        String Dept=sc.next();
        SetEmpDept(Dept);
        System.out.println("Employee DOJ");
        String DOJ=sc.next();
        SetDOJ(DOJ);
        System.out.println("Employee UAN");
        long U=sc.nextLong();
        SetUAN(U);
        System.out.println("Employee PF Number");
        long PF=sc.nextLong();
        SetPF_NO(PF);
        System.out.println("Employee ESI Number");
        long ESI=sc.nextLong();
        SetEsi(ESI);
        System.out.println("Employee Bank Name");
        String BN=sc.next();
        SetBankName(BN);
        System.out.println("Employee Bank Account No");
        long ACCT=sc.nextLong();
        SetBankAcctNo(ACCT);
        System.out.println("Employee Gross Wage");
        double gw=sc.nextDouble();
        SetGrosswage(gw);
        SetTotalWorkingDays(30);
        SetLopDays(1);
        SetPaidDays(GetTotalWorkingDays()-GetLopDays());
        System.out.println("Employee leaves taken");
        int LT=sc.nextInt();
        SetLeavesTaken(LT);
    }
}
