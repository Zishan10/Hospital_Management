import java.util.*;
import java.io.IOException;
import Classes.*;
import fileIO.*;
import java.lang.*;
import java.io.*;

public class Start 
{
        public static void main(String args[]) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();
        fileIO FILE = new fileIO("History"); 
        String str = "";
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t\t\t```````````````````````````````````````");
        System.out.println("\t\t\t\t---------------------------------------");
        System.out.println("\t\t\t\t Welcome to Hospital Management System");
        System.out.println("\t\t\t\t---------------------------------------");
        System.out.println("\t\t\t\t_______________________________________\n");
        boolean repeat = true;

        while (repeat)   
		{  
            System.out.println("\n\t\t\t\t\tWhat do you want to do?\n");
            System.out.println("\t\t\t\t-----------------------------------\n");
            System.out.println("\t\t\t\t1. Admin Panel");
            System.out.println("\t\t\t\t2. Doctor Panel");
            System.out.println("\t\t\t\t3. Patient Panel");
            System.out.println("\t\t\t\t4. Exit\n");
            System.out.println("\t\t\t\t-----------------------------------\n");

            System.out.print("\t\t\t\tEnter Your Choice: ");
            int choice = sc.nextInt();
            System.out.println("\t\t\t\t-----------------------------------");
            switch (choice) 
			{
                case 1:
                    System.out.println("\t\t\t\t-----------------------------------");
                    System.out.print("\t\t\t\tEnter Your Password : ");
                    String j = sc.next();
                    String k = "admin";
                    if (k.equals(j)) 
					{ new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        boolean repeat2 = true;

                        while (repeat2) {
                           
                            System.out.println("\n\t\t\t\t\t-----------------------------------");
                            System.out.println("\t\t\t\t\t            ADMIN PANEL           ");
                            System.out.println("\t\t\t\t\t-----------------------------------\n\n");

                            System.out.println("\t\t\t\tYou have following options: \n");
                            System.out.println("\t\t\t\t1. Insert New Patient");
                            System.out.println("\t\t\t\t2. Remove Patient");
                            System.out.println("\t\t\t\t3. Search Specific Patient");
                            System.out.println("\t\t\t\t4. See All Patient");
                            System.out.println("\t\t\t\t5. Insert New Doctor");
                            System.out.println("\t\t\t\t6. Show All Doctor");
                            System.out.println("\t\t\t\t7. Add Patient History");
                            System.out.println("\t\t\t\t8. Show/Update Patient History");
                            System.out.println("\t\t\t\t9. Show All Patient Prescriptions - ");
                            System.out.println("\t\t\t\t10. Go Back");
                            System.out.println();
                            System.out.print("\t\t\tEnter You Option: ");
                            int option1 = sc.nextInt();
                          
                            switch (option1) {
                                case 1:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\n\n\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\tYou Choose to Insert A Patient");
                                    System.out.println("\t\t\t\t---------------------------------");

                                    System.out.print("\t\t\tEnter Patient ID: ");
                                    int pId1 = sc.nextInt();
                                    str+="\n\t\t Patient ID : "+pId1;
                                    System.out.print("\t\t\tEnter Patient Password: ");
                                    String pass3 = sc.next();
                                    System.out.print("\t\t\tEnter Patient Name: ");
                                    sc.nextLine();
                                    String pName1 = sc.nextLine();
                                    str += "\n\t\t Name : " + pName1;
                                    System.out.print("\t\t\tEnter Patient Gender: ");
                                    String gender1 = sc.next();
                                    System.out.print("\t\t\tEnter Patient Age: ");
                                    int age1 = sc.nextInt();
                                    str+="\n\t\t Age : "+age1;
                                    System.out.print("\t\t\tEnter Patient Address: ");
                                    String sss = sc.nextLine();
									String address1 = sc.nextLine();
									System.out.print("\t\t\tEnter Patient Height in meters: ");
                                    double height1 = sc.nextDouble();
                                    str+="\n\t\t Height : "+height1;
                                    System.out.print("\t\t\tEnter Patient Weight in kg: ");
                                    double weight1 = sc.nextDouble();
                                    str += "\n\t\t Weight : " + weight1;
                                    System.out.print("\t\t\tEnter Patient Blood Group: ");
                                    String bloodgroup1 = sc.next();
                                    str += "\n\t\t Blood Group : " + bloodgroup1;
                                    
                                    Patient p1 = new Patient();
                                    p1.setPatientPass(pass3);
                                    p1.setPatientAge(age1);
                                    p1.setPatientName(pName1);
                                    p1.setPatientAddress(address1);
                                    p1.setPatientGender(gender1);
                                    p1.setPatientHeight(height1);
                                    p1.setPatientWeight(weight1);
                                    p1.setPatientBloodGroup(bloodgroup1);
                                    p1.setPatientId(pId1);
                                    System.out.println("\t\t\t\t.......................................");
                                    if (a.insertPatient(p1)) {
                                        fileIO P1 = new fileIO(pName1);
                                        P1.writeInFile(str);
                                        System.out.println("\t\t\t\t     Patient Inserted with ID: "+ p1.getPatientId());
                                        System.out.println("\t\t\t\t.......................................\n");
                                    } else {
                                        System.out.println("\t\t\t\tPatient Can Not be Insertd......");
                                    }

                                    break;

                                case 2:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\n\n\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\tYou Choose to Remove An Patient");
                                    System.out.println("\t\t\t\t---------------------------------");

                                    System.out.print("\t\t\t\tEnter a Patient ID to Remove: ");
                                    int pId2 = sc.nextInt();

                                    Patient p2 = a.searchPatient(pId2);

                                    if (p2 != null) {
                                        if (a.removePatient(p2)) {
                                            System.out.println("\n\t\t\t\tPatient Removed with ID: " + p2.getPatientId());
                                        } else {
                                            System.out.println("\t\t\t\tPatient Can Not be Removed......");
                                        }
                                    } else {
                                        System.out.println("\t\t\t\tPatient Does Not Exist");
                                    }
                                    break;

                                case 3:
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t Search A Patient");
                                  
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.print("\t\t\t\tEnter an Patient Name to Search: ");
									String pName4 = sc.nextLine();
                                    String pName3 = sc.nextLine();
									//String filename6 = ;
                                    BufferedReader in = new BufferedReader(new FileReader(pName3+".txt"));
		
		                            String line;
                                    while((line = in.readLine()) != null)
                                    {
                                        System.out.println(line);
                                    }
                                    in.close();
	
                                      

                                    break;

                                case 4:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t You Choose to See All Patients");
                                    System.out.println("\t\t\t\t---------------------------------");
                                    a.showAllPatients();
                               

                                    break;

                                case 5:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\n\n\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t You Choose to Insert A Doctor");
                                    System.out.println("\t\t\t\t---------------------------------");

                                    System.out.print("\t\t\t\tEnter Doctor ID: ");
                                    String docId1 = sc.next();
                                    System.out.print("\t\t\t\tEnter Doctor Password: ");
                                    String docpass1 = sc.next();
                                    System.out.print("\t\t\t\tEnter Doctor Name: ");
                                    sc.nextLine();
                                    String docName1 = sc.nextLine();
                                    System.out.print("\t\t\t\tEnter Doctor Degree: ");
                                    String degree1 = sc.nextLine();
                                    System.out.print("\t\t\t\tEnter Doctor Speciality: ");
                                    String speciality1 = sc.next();

                                    str = "";
                                    str+="Doctor ID : "+docId1+"\nName : "+docName1+"\nDegree : "+degree1+"\nSpeciality : "+speciality1;
                                    fileIO file2 = new fileIO(docName1);
                                    file2.writeInFile(str);
                                   
                                    Doctor d1 = new Doctor();
                                    d1.setDoctorId(docId1);
                                    d1.setDoctorPass(docpass1);
                                    d1.setDoctorName(docName1);
                                    d1.setDoctorDegree(degree1);
                                    d1.setDoctorSpecialize(speciality1);

                                    if (a.insertDoctor(d1)) {
                                        System.out.println("\t\t\t\tDoctor Inserted with ID: " + d1.getDoctorId());
                                    } else {
                                        System.out.println("\t\t\t\tDoctor Can Not be Insertd......");
                                    }

                                    break;

                                case 6:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t  You Choose to See All Doctors");
                                    System.out.println("\t\t\t\t---------------------------------");
                                    a.showAllDoctors();
                                    

                                    break;

                                case 7:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t       Input Patient History        ");
                                    System.out.println("\t\t\t\t---------------------------------");

                                    System.out.print("\t\t\t\tEnter Patient ID: ");
                                    int pId4 = sc.nextInt();
                                    Patient p4 = a.searchPatient(pId4);

                                    if (p4 != null) {
                                        System.out.println("\t\t\t\tPatient Found");
                                        System.out.println("\t\t\t\tPatient ID: " + p4.getPatientId());
                                        System.out.println("\t\t\t\tPatient Name: " + p4.getPatientName());
                                        System.out.println("\t\t\t\tPatient Gender: " + p4.getPatientGender());
                                        System.out.println("\t\t\t\tPatient Blood Group: " + p4.getPatientBloodGroup());
                                        System.out.println();
                                        System.out.println("\t\t\t\t-----------Enter Patient History---------- ");
                                        System.out.println();
                                        System.out.print("\t\t\t\tEnter Patient Heart Rate: ");
                                        double heartRate1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Respiratory Rate(breaths per Min) : ");
                                        double respiratoryRate1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Body Temperature : ");
                                        double temperature1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Blood Pressure(systolic): ");
                                        double BPs1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Blood Pressure(dyastolic) : ");
                                        double BPd1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Cholesterol(mg/dL) : ");
                                        double cholesterol1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient RBC(millon/mcL) : ");
                                        double Rbc1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient WBC(thousand/mcL) : ");
                                        double Wbc1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Platelet(lac/mcL) : ");
                                        double platelet1 = sc.nextDouble();
                                        System.out.print("\t\t\t\tEnter Patient Blood Sugar(mg/DL) : ");
                                        double bloodsugar1 = sc.nextDouble();
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        System.out.println();
                                        p4.setTemperature(temperature1);
                                        p4.setHeartRate(heartRate1);
                                        p4.setRespiratoryRate(respiratoryRate1);
                                        p4.setBPd(BPd1);
                                        p4.setBPs(BPs1);
                                        p4.setCholesterol(cholesterol1);
                                        p4.setRbc(Rbc1);
                                        p4.setWbc(Wbc1);
                                        p4.setPlatelet(platelet1);
                                        p4.setBloodSugar(bloodsugar1);
                                        System.out.println("\n\n\t\t\t____________________________________________________________________");
                                        System.out.println("\t\t\t\t\t         SHOWING HISTORY FOR " + p4.getPatientName());
										System.out.println("\t\t\t____________________________________________________________________");
										System.out.println();
           
                                        p4.Checkshow();
                                        System.out.println();
                                    } else {
                                        System.out.println("\t\t\t\tPatient Does Not Exist");
                                    }

                                    break;

                                case 8:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\n\n\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t     UPDATE PATIENT HISTORY         ");
                                    System.out.println("\t\t\t\t---------------------------------");

                                    System.out.print("\t\t\t\tEnter Patient ID: ");
                                    int pId5 = sc.nextInt();
                                    Patient p5 = a.searchPatient(pId5);

                                    if (p5 != null) {
                                        System.out.println("\t\t\t\tPatient Found");
                                        System.out.println("\t\t\t\tPatient ID: " + p5.getPatientId());
                                        System.out.println("\t\t\t\tPatient Name: " + p5.getPatientName());
                                        System.out.println("\t\t\t\tPatient Gender: " + p5.getPatientGender());
                                        System.out.println("\t\t\t\tPatient Blood Group: " + p5.getPatientBloodGroup());
                                        System.out.println();
                                        boolean repeat1 = true;
                                        while (repeat1) {
                                            System.out.println("\t\t\t\t\t---------------------------");
                                            System.out.println("\t\t\t\t\t1.Heart Rate");
                                            System.out.println("\t\t\t\t\t2.Respiratory Rate");
                                            System.out.println("\t\t\t\t\t3.Temperature");
                                            System.out.println("\t\t\t\t\t4.Blood Pressure");
                                            System.out.println("\t\t\t\t\t5.Cholesterol");
                                            System.out.println("\t\t\t\t\t6.RBC");
                                            System.out.println("\t\t\t\t\t7.WBC");
                                            System.out.println("\t\t\t\t\t8.Platelet");
                                            System.out.println("\t\t\t\t\t9.Blood Sugar");
                                            System.out.println("\t\t\t\t\t10.Exit and show Updated History");
                                            System.out.println();
                                            System.out.print("\t\t\t\tWhich Value Do you Want to Update? : ");

                                            int t = sc.nextInt();
                                            switch (t) {

                                                case 1:
                                                    System.out.print("\t\t\t\tEnter Patient Heart Rate: ");
                                                    double heartRate2 = sc.nextDouble();
                                                    p5.setHeartRate(heartRate2);
                                                    break;

                                                case 2:
                                                    System.out.print("\t\t\t\tEnter Patient Respiratory Rate: ");
                                                    double respiratoryRate2 = sc.nextDouble();
                                                    p5.setRespiratoryRate(respiratoryRate2);
                                                    break;

                                                case 3:
                                                    System.out.print("\t\t\t\tEnter Patient Temperature: ");
                                                    double temperature2 = sc.nextDouble();
                                                    p5.setTemperature(temperature2);
                                                    break;

                                                case 4:
                                                    System.out.print("\t\t\t\tEnter Patient Blood Pressure(systolic): ");
                                                    double BPs2 = sc.nextDouble();
                                                    p5.setBPs(BPs2);
                                                    System.out.print("\t\t\t\tEnter Patient Blood Pressure(dyastolic): ");
                                                    double BPd2 = sc.nextDouble();
                                                    p5.setBPd(BPd2);
                                                    break;

                                                case 5:
                                                    System.out.print("\t\t\t\tEnter Patient Cholesterol: ");
                                                    double cholesterol2 = sc.nextDouble();
                                                    p5.setCholesterol(cholesterol2);
                                                    break;

                                                case 6:
                                                    System.out.print("\t\t\t\tEnter Patient RBC: ");
                                                    double Rbc2 = sc.nextDouble();
                                                    p5.setRbc(Rbc2);
                                                    break;

                                                case 7:
                                                    System.out.print("\t\t\t\tEnter Patient WBC: ");
                                                    double Wbc2 = sc.nextDouble();
                                                    p5.setWbc(Wbc2);
                                                    break;

                                                case 8:
                                                    System.out.print("\t\t\t\tEnter Patient Platelet: ");
                                                    double platelet2 = sc.nextDouble();
                                                    p5.setPlatelet(platelet2);
                                                    break;

                                                case 9:
                                                    System.out.print("\t\t\t\tEnter Patient Blood Sugar: ");
                                                    double bloodsugar2 = sc.nextDouble();
                                                    p5.setBloodSugar(bloodsugar2);
                                                    break;

                                                case 10:
                                                    System.out.println("\t\t\t\t---------------------------------");
                                                    System.out.println("\t\t\t\tYou Choose to Go Back.......");
                                                    System.out.println("\t\t\t\t---------------------------------");
                                                    repeat1 = false;
                                                    break;

                                                default:
                                                    System.out.println("\t\t\t\t-----------------------------------");
                                                    System.out.println("\t\t\t\tInvalid Choice.....");
                                                    repeat1 = false;
                                                    break;

                                            }

                                        }
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        System.out.println("\t\t\t\t````````````````````````````````````````````");
                                        System.out.println("\t\t\t\t`````````````UPDATED HISTORY````````````````");
                                        System.out.println();
                                        p5.Checkshow();
                                    } else {
                                        System.out.println("\t\t\t\tPatient Does Not Exist!");
                                    }

                                    break;
                                
                                case 9:
                                    System.out.print("\t\t\t\tShowing All Patient's Prescriptions - \n");
                                    FILE.readFromFile(); break;

                                case 10:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t      You Choose to Go Back      ");
                                    System.out.println("\t\t\t\t---------------------------------");
                                    repeat2 = false;

                                    break;

                                default:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t-----------------------------------");
                                    System.out.println("\t\t\t\tInvalid Choice.....");
                                    break;

                            }
                        }
                    } else 
                        System.out.println("\t\t\t\tInvalid Password");
                    break;

            
					
					
			        case 2:
					
                    System.out.println("\n\n\t\t\t\t-----------------------------------");
                    System.out.print("\t\t\t\tEnter ID : ");
                    String docId2 = sc.next();
					System.out.print("\t\t\t\tEnter Password : ");
                    String docpass2 = sc.next();
                    Doctor d2 = a.searchDoctorByPass(docpass2);
                    Doctor d3 = a.searchDoctor(docId2);
					
                    boolean repeat3 = true;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    while (repeat3) 
					{
                        if (d2 != null && d3!=null)
						{
                          System.out.println();
                          System.out.println("\n\t\t\t\tWelcome ! Dr." + d2.getDoctorName() + " , " + d2.getDoctorDegree()+ " , " + d2.getDoctorSpecialize() + ", ID[" + d2.getDoctorId() + "]");
                                    
                            System.out.println();
                            System.out.println("\t\t\t\t---------------------------------");
                            System.out.println("\t\t\t\t          DOCTOR PANEL           ");
                            System.out.println("\t\t\t\t---------------------------------");
                            System.out.println();
                            System.out.println();
                            System.out.println("\t\t\t\tYou have following options: \n");
                            System.out.println("\t\t\t\t\t1. Prescription\n");
                            System.out.println("\t\t\t\t\t2. Update your Info\n");
                            System.out.println("\t\t\t\t\t3. Exit\n");
                            int o = sc.nextInt();
                            switch (o) 
							{

                                case 1:
								    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.print("\t\t\t\t\tEnter  Patient ID :  ");
                                    int pId5 = sc.nextInt();
                                    Patient p5 = a.searchPatient(pId5);
                                   
                                    if (p5 != null) {
                                        System.out.println();
                                        System.out.println("\t\t\t\tPatient Found");
                                        System.out.println();
                                        System.out.println("\t\t\t\t****************************************");
                                        System.out.println();
                                        System.out.println("\t\t\t\tPatient ID: " + p5.getPatientId());
                                        System.out.println("\t\t\t\tPatient Name: " + p5.getPatientName());
                                        System.out.println("\t\t\t\tPatient Gender: " + p5.getPatientGender());
                                        System.out.println("\t\t\t\tPatient Age: " + p5.getPatientAge());
                                        System.out.println("\t\t\t\tPatient Address: " + p5.getPatientAddress());
                                        System.out.println("\t\t\t\tPatient Body Mass Index: " + p5.getPatientBMI());
                                        System.out.println("\t\t\t\tPatient Blood Group: " + p5.getPatientBloodGroup());
                                        System.out.println();
                                        System.out.println("\t\t\t\t****************************************\n");
                                        
                                        System.out.println("\t\t\t\t\t1. Check full history");
                                        System.out.println("\t\t\t\t\t2. Write Prescription");
										System.out.println("\t\t\t\t\t3. Check Previous History");
                                        System.out.println("\t\t\t\t\t4. Go back");
                                        
										int b = sc.nextInt();

                                        switch (b) {
                                            case 1:
											    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                                System.out.println();
												p5.Checkshow();
                                                d2.comment(p5);
												System.out.println("\n\t\t\t\t--------------------------------------------");
												System.out.println("\n\t\t\t\tPrescription Saved Successfully!!!!\n");
                                                break;
                                            
                                            case 2:
											    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											    d2.comment(p5);
												System.out.println("\n\t\t\t\t--------------------------------------------");
												System.out.println("\n\t\t\t\tPrescription Saved Successfully!!!!\n");
                                                break;
                                            
                                            case 3:
											    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                                System.out.println("\n\n\t\t\t\t\tPrevious History - \n");
												System.out.println("\t\t\t\t\t------------------------------");
                                                p5.showComment();
                                            case 4:
                                                break;

                                        }

                                    } else
                                        System.out.println("\t\t\t\tInvalid Name Or ID !!! Patient Not Found ");
                                    break;

                                    case 2: new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
           									System.out.println("\t\t\t\t\t----------------------------------------"); 
									        System.out.println("\t\t\t\t\t             UPDATE PASSWORD            ");
                                            System.out.println("\t\t\t\t\t----------------------------------------\n");
 									        System.out.println("\t\t\t\t\t1. Update Your Password");
                                            System.out.println("\t\t\t\t\t2. Go back");
                                            int t= sc.nextInt();
										    switch(t)
										    {   case 1: System.out.print("\t\t\t\tEnter Previous Password: ");String pass4=sc.next();
									        
                                                if(pass4.equals(d2.getDoctorPass()))
											    {
											    System.out.print("\t\t\t\tEnter New Password: "); String pass5=sc.next();	
											    d2.setDoctorPass(pass5);
											    System.out.println("\n\t\t\t\tPassword Updated Successfully!!!!\n");
											    }												
										        case 2: break;	
											
										    }
											break;
								    case 3:
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("\t\t\t\t---------------------------------");
                                    System.out.println("\t\t\t\t      You Choose to Go Back      ");
                                    System.out.println("\t\t\t\t---------------------------------");
                                    repeat3 = false;   break;
									
									default:
                                    System.out.println("\t\t\t\t-----------------------------------");
                                    System.out.println("\t\t\t\tInvalid Choice.....");
                                    break;

                            }
                        }else{repeat3=false;System.out.println("\t\t\t\tIncorrect ID or Password");} 
                       
					} 
                    break;
					
					
					
			case 3:
                    System.out.println("\t\t\t\t-----------------------------------");
                    System.out.print("\t\t\t\tEnter ID : ");
                    int pId6 = sc.nextInt();
					System.out.print("\t\t\t\tEnter Password : ");
                    String pass9 = sc.next();
                    Patient p7 = a.searchPatientByPass(pass9);
                    Patient p8 = a.searchPatient(pId6);
                    boolean repeat4 = true;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    while (repeat4) 
					{
                        if (p7 != null && p8 !=null)
						{
                            System.out.println();
                            System.out.println("\n\t\t\t\t\tWelcome ! "+ p7.getPatientName()); 
                                    
                            System.out.println("");
                            System.out.println("\t\t\t\t\t---------------------------------");
                            System.out.println("\t\t\t\t\t         PATIENT PANEL           ");
                            System.out.println("\t\t\t\t\t---------------------------------");
                            System.out.println();
                            System.out.println();
                            System.out.println("\t\t\t\t\tYou have following options: \n");
                            System.out.println("\t\t\t\t\t1. Check Prescriptions\n");
							System.out.println("\t\t\t\t\t2. Check your History\n");
                            System.out.println("\t\t\t\t\t3. Update your Password\n");
                            System.out.println("\t\t\t\t\t4. Exit\n");
                            int l = sc.nextInt();
                            switch (l) 
							{

                                case 1:
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								p7.showComment();
              
                                break;

                                   

                                 
                                case 2: new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								       System.out.println();
									   System.out.println("\t\t\t\tShowing Your History"+p7.getPatientName()+"  \n"); 
									   System.out.println();
								       p7.Checkshow();break;

                                   


								 case 3:    
								            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            								System.out.println("\t\t\t\t\t----------------------------------------"); 
									        System.out.println("\t\t\t\t\t             UPDATE PASSWORD            ");
                                            System.out.println("\t\t\t\t\t----------------------------------------\n");
 									        System.out.println("\t\t\t\t\t1. Update Your Password");
                                            System.out.println("\t\t\t\t\t2. Go back");
                                            int t1= sc.nextInt();
										    switch(t1)
										    {   case 1: System.out.print("\t\t\t\tEnter Previous Password: ");String pass7=sc.next();
									        
                                                if(pass7.equals(p7.getPatientPass()))
											    {
											    System.out.print("\t\t\t\tEnter New Password: "); String pass8=sc.next();	
											    p7.setPatientPass(pass8);
											    System.out.println("\n\t\t\t\tPassword Updated Successfully!!!!\n");
											    }												
										        case 2: break;	
											
										    }
											break;
								 
								 case 4:     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                             System.out.println("\t\t\t\t---------------------------------");
                                             System.out.println("\t\t\t\t      You Choose to Go Back      ");
                                             System.out.println("\t\t\t\t---------------------------------");
                                             repeat4 = false;   break;
									
									default:
                                    System.out.println("\t\t\t\t-----------------------------------");
                                    System.out.println("\t\t\t\tInvalid Choice.....");
                                    break;

                            }
                        }    else{repeat4=false;System.out.println("\t\t\t\tIncorrect ID or Password");} 
                             
                    } 
                        break;
					
					
					
			case 4:  	
			             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            			 System.out.println("\n\n\n\t\t\t\t------------------------------------------");
                         System.out.println("\t\t\t\t                 Thanks                     ");
						 System.out.println("\t\t\t\t------------------------------------------\n");
						 System.out.println("\t\t\t\t____________________powered by Technocrats\n");
						 repeat = false;  break;
									
			default:
            System.out.println("\t\t\t\t-----------------------------------");
		    System.out.println("\t\t\t\tInvalid Choice.....");break;
                                                        
					
					
					
					
		    } 

        } 
    }
}