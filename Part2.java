package Assignment1;
import java.io.*; 
public class Part2 
{
	public void getData() throws IOException
	{
		System.out.println("Get data");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		System.out.println("Data is"+Integer.parseInt(str));
	}
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Part2 a= new Part2();
		a.getData();
	}
}