package Interfaces;
import Classes.Patient;
import java.lang.*;


public interface PatientOperations
{    

     public Patient searchPatient(int pId);
	 public Patient searchPatientByPass(String pass1);
	 public Patient searchPatientByName(String pName);
	 public boolean insertPatient(Patient p);
	 public boolean removePatient(Patient p);
	 public void showAllPatients();
	 
	 public void Checkshow();
	  
	  
}