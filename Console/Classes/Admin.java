package Classes;
import java.lang.*;
import Interfaces.*;

public class Admin extends Patient implements PatientOperations, DoctorOperations
{
    private Patient patients[] = new Patient[500];
    private Doctor doctors[] = new Doctor[100];

    public boolean insertPatient(Patient p) {
        boolean flag = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = p;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removePatient(Patient p) {
        boolean flag = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == p) {
                patients[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void showAllPatients() 
	{   System.out.println("\n\n\t\t\t|     ID No.   |"+"   Name    |"+"   Gender   |"+"    Age    |"+"      BloodGroup      |" );
	    System.out.println("\t\t\t____________________________________________________________________________" );
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
        System.out.println("\t\t\t        "+patients[i].getPatientId()+"      "+"      "+patients[i].getPatientName()+"      "+"    "+patients[i].getPatientGender()+"       "+
		 "    "+patients[i].getPatientAge()+"       "+"         "+patients[i].getPatientBloodGroup()+"        " );       
		   }
        }System.out.println("\t\t\t____________________________________________________________________________" );
    }

    public Patient searchPatient(int pId) {
        Patient p = null;

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                if (patients[i].getPatientId() == pId) {
                    p = patients[i];
                    break;
                }
            }
        }
        return p;
    }

    public Patient searchPatientByName(String pName) {
        Patient p = null;

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                if (patients[i].getPatientName().equals(pName)) {
                    p = patients[i];
                    break;
                }
            }
        }
        return p;
    }
	
	
	   public Patient searchPatientByPass(String pass1) {
        Patient p = null;

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                if (patients[i].getPatientPass().equals(pass1)) {
                    p = patients[i];
                    break;
                }
            }
        }
        return p;
    }
	

    public Doctor searchDoctorByPass(String docpass) {
        Doctor doctor = null;

        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
                if (doctors[i].getDoctorPass().equals(docpass)) {
                    doctor = doctors[i];
                    break;
                }
            }
        }
        return doctor;
    }
	
	    public Doctor searchDoctorByName(String docName) {
        Doctor doctor = null;

        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
                if (doctors[i].getDoctorName().equals(docName)) {
                    doctor = doctors[i];
                    break;
                }
            }
        }
        return doctor;
    }
	

    public boolean insertDoctor(Doctor d) {
        boolean flag = false;
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] == null) {
                doctors[i] = d;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeDoctor(Doctor d) {
        boolean flag = false;
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] == d) {
                doctors[i] = null;
                flag = true;
                break;
            }
        }
        return flag;   
    }

    public void showAllDoctors() {
        System.out.println("\n\n\t\t\t|     ID No.   |"+"  Name    |"+"   Degree   |"+"    Speciality    |");
		System.out.println("\t\t\t____________________________________________________________ ");
	        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
           
        System.out.println("\t\t\t       "+doctors[i].getDoctorId()+"            "+doctors[i].getDoctorName()+"          "+doctors[i].getDoctorDegree()+"            "+
		doctors[i].getDoctorSpecialize());}
		}
        System.out.println("\t\t\t____________________________________________________________ ");
    }

    public Doctor searchDoctor(String docId) {
        Doctor doctor1 = null;

        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] != null) {
                if (doctors[i].getDoctorId().equals(docId)) {
                    doctor1 = doctors[i];
                    break;
                }
            }
        }
        return doctor1;
    }
}