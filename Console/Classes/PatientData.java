package Classes;
import java.lang.*;
import java.util.*;

class PatientData 

{   private double heartRate;
    private double respiratoryRate;
    private double temperature;
    private double BPs;
    private double BPd;
    private double cholesterol;
    private double Rbc;
    private double Wbc;
    private double platelet;
    private double bloodSugar;
	
	
    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;}

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;}

    public void setBPs(double BPs) {
        this.BPs = BPs; }

    public void setBPd(double BPd) {
        this.BPd = BPd;}

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol; }

    public void setRbc(double Rbc) {
        this.Rbc = Rbc;}

    public void setWbc(double Wbc) {
        this.Wbc = Wbc;  }

    public void setPlatelet(double platelet) {
        this.platelet = platelet; }

  

    public void setBloodSugar(double bloodSugar) 
	{this.bloodSugar = bloodSugar;}

    public void setTemperature(double temperature) 
	{this.temperature = temperature;}

    public double getHeartRate() 
	{return heartRate;}

    public double getRespiratoryRate()
        { return respiratoryRate; }

    public double getTemperature() 
        {return temperature; }

    public double getBPs()
        { return BPs; }

    public double getBPd()
        { return BPd; }

    public double getCholesterol()
         {return cholesterol;}

    public double getRbc() 
       { return Rbc;}

    public double getWbc() 
        {return Wbc; }

    public double getPlatelet() 
        {return platelet; }

    public double getBloodSugar() {
    return bloodSugar;   }
		
}