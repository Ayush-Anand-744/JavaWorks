package ASSIGNMENT_3;
import java.util.*; 
public class BOOK_FUNCTIONS_ASSIGNMENT_3_PART_2_BOOK
{
	ArrayList<BOOK_ASSIGNMENT_3_PART_2_BOOK> BookShelf = new ArrayList<>(); 
	Scanner sc = new Scanner(System.in); 
	public void AddBook() 
	{ 
		System.out.print("Enter Number Of Books that you want to Add: "); 
		int NoOfBooks = sc.nextInt(); 
		System.out.println("Enter Books/s"); 
		for(int i = 0; i < NoOfBooks; i++) 
		{ 
			System.out.print("Enter Book Id:"); 
			int ID = sc.nextInt(); 
			System.out.print("Enter Book Name:"); 
			String Name = sc.next();
			System.out.print("Enter Book Price:"); 
			double Pri = sc.nextDouble(); 
			BOOK_ASSIGNMENT_3_PART_2_BOOK B = new BOOK_ASSIGNMENT_3_PART_2_BOOK(ID, Name, Pri); 
			BookShelf.add(B); 
		} 
	} 
	public void PrintBooksDetails() 
	{ 
		System.out.println("-----------Book Details---------- --"); 
		for (int i = 0; i < BookShelf.size(); i++) 
		{ 
			PrintBook(i); 
		} 
	} 
	private void PrintBook(int i) 
	{ 
		System.out.println("Book Id\t Book Name\t Book Price"); 
		System.out.println(BookShelf.get(i).GetBKID() + "\t" + BookShelf.get(i).GetBKName() + "\t" + BookShelf.get(i).GetBKPrice()); 
	} 
	public void PrintBookToString() 
	{ 
		System.out.println("-----------Book Details---------- --"); 
		String List = BookShelf.toString(); 
		System.out.println(List); 
	}
	public void DeleteBook() 
	{ 
		System.out.print("Enter Book ID For Deleting the Book:"); 
		int BKID = sc.nextInt(); 
		System.out.println("Book Id" + "\t" + "Book Name" + "\t" + "Book Price"); 
		for(int i = 0; i < BookShelf.size(); i++) 
		{ 
			if(BookShelf.get(i).GetBKID() == BKID) 
			{ 
				BookShelf.remove(i); 
			} 
			else 
			{ 
				System.out.println("Book Not Available"); 
			} 
		} 
	}
}
