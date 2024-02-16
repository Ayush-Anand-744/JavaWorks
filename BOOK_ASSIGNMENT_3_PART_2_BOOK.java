package ASSIGNMENT_3;
public class BOOK_ASSIGNMENT_3_PART_2_BOOK
{
	private int BKID; 
	private String BKName; 
	private double BKPrice;
	public BOOK_ASSIGNMENT_3_PART_2_BOOK(int BKID, String BKName, double BKPrice)
	{ 
		super(); 
		this.BKID = BKID; 
		this.BKName = BKName; 
		this.BKPrice = BKPrice; 
	} 
	public int GetBKID()
	{ 
		return BKID; 
	} 
	public void SetBKID(int BKID)
	{ 
		this.BKID = BKID; 
	} 
	public String GetBKName()
	{ 
		return BKName; 
	} 
	public void SetBKName(String BKName)
	{ 
		this.BKName = BKName; 
	} 
	public double GetBKPrice()
	{ 
		return BKPrice; 
	} 
	public void setBkPrice(double BKPrice)
	{ 
		this.BKPrice = BKPrice; 
	} 
	@Override 
	public String toString() 
	{ 
		return("id = " + BKID + ", Name = " + BKName + ", Price = " + BKPrice + "\n"); 
	}


}
