package Classes;
import java.util.*;
import fileIO.*;
import Interfaces.*;

public class Doctor extends DoctorData 
{
    Scanner sc = new Scanner(System.in);  

    public void comment(Patient p)
	{
		fileIO FILE1 = new fileIO("Prescriptions");
        String temp = "",str;
        System.out.print("\n\n\n\t\t\t\t\tEnter today's date(yyyy-mm-dd) : ");
        str = sc.nextLine();
        temp+="\n\n\n\t\t\t\tAppointment Date : "+str+" \n";
        System.out.print("\n\n\t\t\t\t\tEnter comment : ");
        str = sc.nextLine();
		temp+="\t\t\t\tPatient's name : "+p.getPatientName()+"\n";
		temp+="\t\t\t\tDoctor's name : "+this.getDoctorName()+"\n";
        temp+="\t\t\t\tComment : "+str + "\n";
        System.out.print("\n\n\t\t\t\t\tEnter next Appointment date(yyyy-mm-dd) : ");
        str = sc.nextLine();
        temp +="\t\t\t\tNext Appointment Date : "+str+ "  \n\n";
        FILE1.writeInFile(temp);
        
		for(int i=0;i<p.history.length;i++)
            if(p.history[i]==null || p.history[i].equals("")){
                p.history[i]=temp;
                break;
            }
        for(int i=0;i<p.history.length;i++){
            if(p.history[i]==null)
                p.history[i]="";
        }
        Arrays.sort(p.history);
    }
	
}