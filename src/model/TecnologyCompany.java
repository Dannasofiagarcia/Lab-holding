package model;

import java.util.*;

public class TecnologyCompany extends ServiceCompany implements NaturalResource{

	//Constantes

	public final static String CONSULTING = "Consulting";
	public final static String TRAINING = "Training";
	public final static String SOFTWARE_DEVELOPMENT = "Software development";
	public final static String INFRAESTRUCTURE = "Infraestructure";
	public final static String SOFTWARE_SERVICE = "Software service";
	public final static String PLATFORM = "Platform";

	//Atributos

	private String service;
	private double energy;


	//Constructor

	public TecnologyCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution, String service, double energy){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.service = service;
		this.energy = energy;
	}

	//Metodos

	/**
    * This method return service of the company <br>

    * <b>pre:</b> service is initilized, service != null <br>

    * <b>post:</b> service was returned <br>

    * @return String The method returns service of the company<br>
    */

	public String getService(){
		 return service;
	}


	/**
    * This method set service of the company <br>

    * <b>pre:</b> service is initilized, service != null <br>

    * <b>post:</b> service was changed <br>

    * @param service Is the new service<br>
    */

    public void setService (String service) {
	     this.service = service;
	}


	/**
    * This method return the quantity of energy of the company <br>

    * <b>pre:</b> energy is initilized, energy != null <br>

    * <b>post:</b> energy was returned <br>

    * @return String The method returns the quantity of energy of the company<br>
    */

	public double getEnergy(){
		 return energy;
	}


	/**
    * This method set the quantity of energy of the company <br>

    * <b>pre:</b> energy is initilized, energy != null <br>

    * <b>post:</b> energy was changed <br>

    * @param energy Is the new quantity of energy<br>
    */

    public void setEnergy (double energy) {
	     this.energy = energy;
	}


	/**
    * This method calculate how many trees company has to sembrate <br>

    * <b>pre:</b> energy is initialized, energy != null <br>

    * <b>post:</b> It has been calculate how many trees company should sembrate <br>

    * @return String The method return a message with the information of how many trees company should sembrate <br>
    */

	public String naturalResourceXtree(){

		int valueToPay = 0;
		String msg = "";

		if (energy >= 1 && energy < 1000 ){
			valueToPay = 8;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		else if (energy > 1001 && energy < 3000){
			valueToPay = 35;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		else if (energy > 3000){
			valueToPay = 500;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		return msg;
	}


}//Cierra la clase
