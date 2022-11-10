package Interfaces;
import Classes.Doctor;
import java.lang.*;


public interface DoctorOperations
{    

     public Doctor searchDoctor(String docId);
	 public Doctor searchDoctorByPass(String docpass);
	 public Doctor searchDoctorByName(String docName);
	 public boolean insertDoctor(Doctor d);
	 public boolean removeDoctor(Doctor d);
	 public void showAllDoctors();
	  
	  
}