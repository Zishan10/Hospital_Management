package Classes;
import java.lang.*;
import java.util.*;

class DoctorData 
{
	
	private String docName;
    private String degree;
    private String specialize;
    private String docpass;
    private String docId;
  
 
    public void setDoctorId(String docId) {
        this.docId = docId;}

    public void setDoctorPass(String docpass) {
        this.docpass = docpass;}
    
	public void setDoctorName(String docName) {
        this.docName = docName;  }

    public void setDoctorDegree(String degree) {
        this.degree = degree;}

    public void setDoctorSpecialize(String specialize) {
        this.specialize = specialize; }

    public String getDoctorPass() {
        return docpass; }

    public String getDoctorName() {
        return docName; }

    public String getDoctorDegree() {
        return degree; }

    public String getDoctorSpecialize() {
        return specialize;}

    public String getDoctorId() {
        return docId; }
}