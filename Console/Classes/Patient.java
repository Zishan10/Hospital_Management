package Classes;
import java.lang.*;
import java.util.*;
import Interfaces.*;

public class Patient extends PatientData
{
    private int pId;
    private String pName;
    private String address;
    private String gender;
    private double height;
    private double weight;
    private int age;
    private String bloodGroup;
    private String pass1;

   

    String history[] = new String[100];

    public void setPatientId(int pId) {
        this.pId = pId;
    }

    public void setPatientPass(String pass1) {
        this.pass1 = pass1;
    }

    public void setPatientName(String pName) {
        this.pName = pName;
    }

    public void setPatientAddress(String address) {
        this.address = address;
    }

    public void setPatientGender(String gender) {
        this.gender = gender;
    }

    public void setPatientHeight(double height) {
        this.height = height;
    }

    public void setPatientAge(int age) {
        this.age = age;
    }

    public void setPatientWeight(double weight) {
        this.weight = weight;
    }

    public void setPatientBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getPatientId() {
        return pId; }

    public int getPatientAge() {
        return age; }

    public String getPatientName() {
        return pName; }

    public String getPatientAddress() {
        return address;}

    public String getPatientGender() {
        return gender;}

    public double getPatientHeight() {
        return height; }

    public double getPatientWeight() {
        return weight;}

    public double getPatientBMI() {
        return (weight / (height * height)); }

    public String getPatientPass() {
        return pass1; }

    public String getPatientBloodGroup() {
        return bloodGroup;}
		
		public void Checkshow()
		{
        System.out.println("\t\t\t|         CHECKED             |"+"   VALUE    |"+"      COMMENT          |");
		System.out.println("\t\t\t____________________________________________________________________");
        if (60 < getHeartRate() && getHeartRate() < 100) {
		System.out.println("\t\t\t       Heart Rate                  " + getHeartRate() +"         is normal");  
		}else
		System.out.println("\t\t\t       Heart Rate                  " + getHeartRate() +"         is not normal");  
		System.out.println("\t\t\t____________________________________________________________________");
        if (getRespiratoryRate() >= 14 && getRespiratoryRate() <= 18) {
        System.out.println("\t\t\t       Respiratory Rate            " + getRespiratoryRate() +"         is normal");  
		}else
		System.out.println("\t\t\t       Respiratory Rate            " + getRespiratoryRate() +"         is not normal");  
        System.out.println("\t\t\t____________________________________________________________________");

        if (getTemperature() < 98.4) {
        System.out.println("\t\t\t       Temperature                 " + getTemperature() +"         is normal");  
		}else
		System.out.println("\t\t\t       Temperature                 " + getTemperature() +"         is High");  
        System.out.println("\t\t\t____________________________________________________________________");
       

        if (getBPd() > 80 && getBPs() < 120) {
        System.out.println("\t\t\t       BloodPressure             " + getBPs()+", "+getBPd() +   "      is normal");  
		}else
		System.out.println("\t\t\t       BloodPressure             " + getBPs()+", "+getBPd() +"      is not normal"); 
        System.out.println("\t\t\t____________________________________________________________________");
     
   

        if (getCholesterol() < 200) {
        System.out.println("\t\t\t       Cholesterol                 " + getCholesterol()+"          is normal"); 
        } else if (getCholesterol() >= 200 && getCholesterol() <= 239) {
        System.out.println("\t\t\t       Cholesterol                  " + getCholesterol()+"          is at Borderline"); 
        } else if (getCholesterol() > 240) {
        System.out.println("\t\t\t       Cholesterol                 " + getCholesterol()+"          is High"); 
        }
        System.out.println("\t\t\t____________________________________________________________________");


        if (getRbc() >= 4.7 && getRbc() <= 6.1) {
        System.out.println("\t\t\t       RBC                         " + getRbc()+"          is normal"); 
        } else {
        System.out.println("\t\t\t       RBC                         " + getRbc()+"        is not normal"); 
        }
        System.out.println("\t\t\t____________________________________________________________________");

        if (getWbc() >= 4 && getWbc() <= 11) {
        System.out.println("\t\t\t       WBC                         " + getWbc()+"          is normal"); 
        } else {
        System.out.println("\t\t\t       WBC                         " + getWbc()+"         is not normal"); 
        }
        System.out.println("\t\t\t____________________________________________________________________");

        if (getPlatelet() >= 2.5 && getPlatelet() <= 5) {
        System.out.println("\t\t\t       Platelet                    " + getPlatelet()+"          is normal"); 
        } else {
        System.out.println("\t\t\t       Platelet                    " + getPlatelet()+"          is not normal"); 
        }
        System.out.println("\t\t\t____________________________________________________________________");

        if (getBloodSugar() > 7.8 && getBloodSugar() < 11) {
        System.out.println("\t\t\t       Blood Sugar                 " + getBloodSugar()+"          is normal"); 
        } else {
        System.out.println("\t\t\t       Blood Sugar                 " + getBloodSugar()+"          is not normal"); 
        }
        System.out.println("\t\t\t____________________________________________________________________");
    }

        public void showComment()
		{
        for(int i = 0;i<history.length;i++)
        if(history[i].equals("")){continue;}
        else System.out.println("\t\t\t"+history[i]);
        }



}

