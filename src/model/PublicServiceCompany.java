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

	public String getTypeService(){
		 return typeService;
	}

    public void setTypeService (String typeService) {
	     this.typeService = typeService;
	}

	public int getTotalNumberOfSuscribers(){
		 return totalNumberOfSuscribers;
	}

    public void setTotalNumberOfSuscribers (int totalNumberOfSuscribers) {
	     this.totalNumberOfSuscribers = totalNumberOfSuscribers;
	}

	public int getSuscribers1and2(){
		 return suscribers1and2;
	}

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

