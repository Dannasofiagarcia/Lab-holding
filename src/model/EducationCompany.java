package model;

import java.util.*;

public class EducationCompany extends ServiceCompany{

	//Constantes

	public final static String UNIVERSITY = "University";
	public final static String HIGH_SCHOOL = "High school";

	//Atributos

	private String aprobationRegisterMEN;
	private int yearsAccreditation;
	private int positionICFES;
	private String leadershipName;
	private String educationSector;
	private int activeStudents1and2;
	private int totalActiveStudents;

	//Constructor

	public EducationCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution,
		                     String aprobationRegisterMEN, int yearsAccreditation, int positionICFES, String leadershipName, String educationSector, int activeStudents1and2, int totalActiveStudents){

		super (nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.aprobationRegisterMEN = aprobationRegisterMEN;
		this.yearsAccreditation = yearsAccreditation;
		this.positionICFES = positionICFES;
		this.leadershipName = leadershipName;
		this.educationSector = educationSector;
		this.activeStudents1and2 = activeStudents1and2;
		this.totalActiveStudents = totalActiveStudents;
	}

	//Metodos

	public String getAprobationRegisterMEN(){
		 return aprobationRegisterMEN;
	}

    public void setAprobationRegisterMEN (String aprobationRegisterMEN) {
	     this.aprobationRegisterMEN = aprobationRegisterMEN;
	}

	public int getYearsAccreditation(){
		 return yearsAccreditation;
	}

    public void setYearsAccreditation (int yearsAccreditation) {
	     this.yearsAccreditation = yearsAccreditation;
	}

	public int getPositionICFES(){
		 return positionICFES;
	}

    public void setPositionICFES (int positionICFES) {
	     this.positionICFES = positionICFES;
	}

	public String getLeadershipName(){
		 return leadershipName;
	}

    public void setLeadershipName (String leadershipName) {
	     this.leadershipName = leadershipName;
	}

	public String educationSector(){
		 return educationSector;
	}

    public void setEducationSector (String educationSector) {
	     this.educationSector = educationSector;
	}

	public int getActiveStudents1and2(){
		 return activeStudents1and2;
	}

    public void setActiveStudents1and2 (int activeStudents1and2) {
	     this.activeStudents1and2 = activeStudents1and2;
	}

	public int getTotalActiveStudents(){
		 return totalActiveStudents;
	}

    public void setTotalActiveStudents (int totalActiveStudents) {
	     this.totalActiveStudents = totalActiveStudents;
	}

	/**
    * This method calculates proculture tax <br>

    * <b>pre:</b> activeStudents1and2 is initilized, activeStudents1and2 != null <br>

    * <b>post:</b> Proculture tax has been calculated <br>

    * @return String The method returns a message with the information of the tax <br>
    */

    public String procultureTax (){

    	double procultureTax = 0;
    	String msg = "";

    	procultureTax = 20-(activeStudents1and2/100);

    	if (procultureTax < 0){

    		msg = "La empresa no debe pagar el impuesto";
    	}

    	else {

    		msg = ("El porcentaje de impuesto a pagar es de " + procultureTax);
    	}

    return msg;
    }
}
