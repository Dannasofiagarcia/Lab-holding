package model;

import java.util.*;

public class EducationCompany extends ServiceCompany implements ProcultureTax{

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

	/**
    * This method return the number of aprobation register of the company <br>

    * <b>pre:</b> aprobationRegisterMEN is initilized, aprobationRegisterMEN != null <br>

    * <b>post:</b> aprobationRegisterMEN was returned <br>

    * @return String The method returns the number of aprobation register of the company<br>
    */

	public String getAprobationRegisterMEN(){
		 return aprobationRegisterMEN;
	}


	/**
    * This method set the number of aprobation register of the company <br>

    * <b>pre:</b> aprobationRegisterMEN is initilized, aprobationRegisterMEN != null <br>

    * <b>post:</b> aprobationRegisterMEN was changed <br>

    * @param aprobationRegisterMEN Is the new aprobation register<br>
    */

    public void setAprobationRegisterMEN (String aprobationRegisterMEN) {
	     this.aprobationRegisterMEN = aprobationRegisterMEN;
	}


	/**
    * This method return the number of accreditation years of the company <br>

    * <b>pre:</b> yearsAccreditation is initilized, yearsAccreditation != null <br>

    * <b>post:</b> yearsAccreditation was returned <br>

    * @return int The method returns the number of accreditation years of the company<br>
    */

	public int getYearsAccreditation(){
		 return yearsAccreditation;
	}


	/**
    * This method set the number of accreditation years of the company <br>

    * <b>pre:</b> yearsAccreditation is initilized, yearsAccreditation != null <br>

    * <b>post:</b> yearsAccreditation was changed <br>

    * @param yearsAccreditation Is the new number of years<br>
    */

    public void setYearsAccreditation (int yearsAccreditation) {
	     this.yearsAccreditation = yearsAccreditation;
	}


	/**
    * This method returns the ICFES position of the company <br>

    * <b>pre:</b> positionICFES is initilized, positionICFES != null <br>

    * <b>post:</b> positionICFES was returned <br>

    * @return int The method returns the ICFES position of the company<br>
    */

	public int getPositionICFES(){
		 return positionICFES;
	}


	/**
    * This method set the ICFES position of the company <br>

    * <b>pre:</b> positionICFES is initilized, positionICFES != null <br>

    * <b>post:</b> positionICFES was changed <br>

    * @param positionICFES is the new ICFES position <br>
    */

    public void setPositionICFES (int positionICFES) {
	     this.positionICFES = positionICFES;
	}


	/**
    * This method return name of the leadership of the company <br>

    * <b>pre:</b> leadershipName is initilized, leadershipName != null <br>

    * <b>post:</b> leadershipName was returned <br>

    * @return String The method returns the name of the leadership of the company<br>
    */

	public String getLeadershipName(){
		 return leadershipName;
	}


	/**
    * This method set name of the leadership of the company <br>

    * <b>pre:</b> leadershipName is initilized, leadershipName != null <br>

    * <b>post:</b> leadershipName was changed <br>

    * @param leadershipName Is the new name of the leadership<br>
    */

    public void setLeadershipName (String leadershipName) {
	     this.leadershipName = leadershipName;
	}


	/**
    * This method return the education sector of the company <br>

    * <b>pre:</b> educationSector is initilized, educationSector != null <br>

    * <b>post:</b> educationSector was returned <br>

    * @return String The method returns the education sector of the company<br>
    */

	public String educationSector(){
		 return educationSector;
	}


	/**
    * This method set the education sector of the company <br>

    * <b>pre:</b> educationSector is initilized, educationSector != null <br>

    * <b>post:</b> educationSector was changed <br>

    * @param educationSector Is the new education sector<br>
    */

    public void setEducationSector (String educationSector) {
	     this.educationSector = educationSector;
	}


	/**
    * This method return the number of active students in stratum 1 and 2 of company <br>

    * <b>pre:</b> activeStudents1and2 is initilized, activeStudents1and2 != null <br>

    * <b>post:</b> activeStudents1and2 was returned <br>

    * @return int The method returns the number of active students in stratum 1 and 2 of company<br>
    */

	public int getActiveStudents1and2(){
		 return activeStudents1and2;
	}


	/**
    * This method set the number of active students in stratum 1 and 2 of company <br>

    * <b>pre:</b> activeStudents1and2 is initilized, activeStudents1and2 != null <br>

    * <b>post:</b> activeStudents1and2 was changed <br>

    * @param activeStudents1and2 Is the new number of active students in stratum 1 and 2<br>
    */

    public void setActiveStudents1and2 (int activeStudents1and2) {
	     this.activeStudents1and2 = activeStudents1and2;
	}


	/**
    * This method return the total of active students in the company <br>

    * <b>pre:</b> totalActiveStudents is initilized, totalActiveStudents != null <br>

    * <b>post:</b> totalActiveStudents was returned <br>

    * @return String The method returns the number of active students in the company<br>
    */

	public int getTotalActiveStudents(){
		 return totalActiveStudents;
	}


	/**
    * This method set the total of active students in the company <br>

    * <b>pre:</b> totalActiveStudents is initilized, totalActiveStudents != null <br>

    * <b>post:</b> totalActiveStudents was changed <br>

    * @param totalActiveStudents Is the new total of active students<br>
    */

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
