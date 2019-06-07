package model;

import java.util.*;

public class PublicServiceCompany extends ServiceCompany implements ProcultureTax{

	//Constantes

	public final static String SEWERAGE = "Sewerage";
	public final static String ENERGY = "Energy";
	public final static String AQUEDUCT = "Aqueduct";

	//Atributos

	private String typeService;
	private int totalNumberOfSuscribers;
	private int suscribers1and2;

	//Constructor

	public PublicServiceCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution,
		                         String typeService, int totalNumberOfSuscribers, int suscribers1and2){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.typeService = typeService;
		this.totalNumberOfSuscribers = totalNumberOfSuscribers;
		this.suscribers1and2 = suscribers1and2;
	}

	//Metodos

	/**
    * This method return the type of service of the company <br>

    * <b>pre:</b> typeService is initilized, typeService != null <br>

    * <b>post:</b> typeService was returned <br>

    * @return String The method returns the type of service of the company<br>
    */

	public String getTypeService(){
		 return typeService;
	}


	/**
    * This method set the type of service of the company <br>

    * <b>pre:</b> typeService is initilized, typeService != null <br>

    * <b>post:</b> typeService was changed <br>

    * @param typeService Is the new type service <br>
    */

    public void setTypeService (String typeService) {
	     this.typeService = typeService;
	}


	/**
    * This method return the total number of suscribers in the company <br>

    * <b>pre:</b> totalNumberOfSuscribers is initilized, totalNumberOfSuscribers != null <br>

    * <b>post:</b> totalNumberOfSuscribers was returned <br>

    * @return int The method returns the total number of suscribers<br>
    */

	public int getTotalNumberOfSuscribers(){
		 return totalNumberOfSuscribers;
	}


	/**
    * This method set the total number of suscribers in the company <br>

    * <b>pre:</b> totalNumberOfSuscribers is initilized, totalNumberOfSuscribers != null <br>

    * <b>post:</b> totalNumberOfSuscribers was changed <br>

    * @param totalNumberOfSuscribers Is the new total number of suscribers<br>
    */

    public void setTotalNumberOfSuscribers (int totalNumberOfSuscribers) {
	     this.totalNumberOfSuscribers = totalNumberOfSuscribers;
	}

	/**
    * This method return the number of suscribers in statrum 1 and 2 of the company <br>

    * <b>pre:</b> suscribers1and2 is initilized, suscribers1and2 != null <br>

    * <b>post:</b> suscribers1and2 was returned <br>

    * @return int The method returns the number of suscribers in stratrum 1 and 2 of the company<br>
    */

	public int getSuscribers1and2(){
		 return suscribers1and2;
	}


	/**
    * This method set the number of suscribers in statrum 1 and 2 of the company <br>

    * <b>pre:</b> suscribers1and2 is initilized, suscribers1and2 != null <br>

    * <b>post:</b> suscribers1and2 was changed <br>

    * @param suscribers1and2 Is the new number of suscribers in statrum 1 and 2 <br>
    */

    public void setSuscribers1and2 (int suscribers1and2) {
	     this.suscribers1and2 = suscribers1and2;
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

    	procultureTax = 40-(totalNumberOfSuscribers-suscribers1and2/100);

    	if (procultureTax < 0){

    		msg = "La empresa no debe pagar el impuesto";
    	}

    	else {

    		msg = ("El porcentaje de impuesto a pagar es de " + procultureTax);
    	}

    return msg;
    }

}

