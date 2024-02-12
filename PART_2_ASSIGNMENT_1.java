package ASSIGNMENT_1;
import java.io.*;
public class PART_2_ASSIGNMENT_1
{
	public void GetData() throws IOException
	{
		System.out.println("Get data");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String Str=bf.readLine();
		System.out.println("Data is"+Integer.parseInt(Str));
	}
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		PART_2_ASSIGNMENT_1 a= new PART_2_ASSIGNMENT_1();
		a.GetData();
	}
}
