import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner;

public class DoctorID
{
	private String id;
	private String name;
	
	DoctorID(String id,String name)
	{
		this.id = id;
		this.name = name;
		
		try (
		FileWriter f = new FileWriter("DoctorID.txt", true);
		BufferedWriter b = new BufferedWriter(f);
		PrintWriter p = new PrintWriter(b);
		) 
		{ 
		p.println(id+"   :   "+name);
		} catch (IOException i) 
		{
			i.printStackTrace(); 
		}	
	}
}