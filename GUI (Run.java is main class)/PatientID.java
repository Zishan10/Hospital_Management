import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner;

public class PatientID
{
	private String id;
	private String name;
	
	PatientID(String id,String name)
	{
		this.id = id;
		this.name = name;
		
		try (
		FileWriter f = new FileWriter("PatientID.txt", true);
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