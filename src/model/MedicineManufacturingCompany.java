package model;

import java.util.*;

public class MedicineManufacturingCompany extends ManufacturingCompany implements NaturalResource{ 

	//Constantes

	public final static String CURRENT = "Current";
	public final static String NOT_RENEWED = "Not renewed";
	public final static String MANUFACTURING_EXPORTING = "Manufacturing and exporting";
	public final static String MANUFACTURING_SELLING = "Manufacturing and selling";
	public final static String IMPORT_SELL = "Import and sell";


	//Atributos

	private String healthRegister;
	private String status;
	private int dueMonth;
	private int dueYear;
	private String mode;


	//Constructor

	public MedicineManufacturingCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution,
										 String healthRegister, String status, int dueMonth, int dueYear, String mode){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.healthRegister = healthRegister;
		this.status = status;
		this.dueMonth = dueMonth;
		this.dueYear = dueYear;
		this.mode = mode;

	}

	//Metodos

	/**
    * This method return the health register of the company <br>

    * <b>pre:</b> healthRegister is initilized, healthRegister != null <br>

    * <b>post:</b> healthRegister was returned <br>

    * @return String The method return the health register of the company<br>
    */

	public String getHealthRegister(){
		 return healthRegister;
	}


	/**
    * This method set the health register of the company <br>

    * <b>pre:</b> healthRegister is initilized, healthRegister != null <br>

    * <b>post:</b> healthRegister was changed <br>

    * @param healthRegister Is the new health register <br>
    */

    public void setHealthRegister (String healthRegister) {
	     this.healthRegister = healthRegister;
	}


	/**
    * This method return the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was returned <br>

    * @return String The method return status of the company<br>
    */

	public String getStatus(){
		 return status;
	}


	/**
    * This method set the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was changed <br>

    * @param status Is the new status<br>
    */

    public void getStatus (String status) {
	     this.status = status;
	}


	/**
    * This method return the due month of the company <br>

    * <b>pre:</b> dueMonth is initilized, dueMonth != null <br>

    * <b>post:</b> dueMonth was returned <br>

    * @return int The method return the due month of the company<br>
    */

	public int getDueMonth(){
		 return dueMonth;
	}


	/**
    * This method set the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was changed <br>

    * @param dueMonth Is the new due month<br>
    */

    public void setDueMonth (int dueMonth) {
	     this.dueMonth = dueMonth;
	}


	/**
    * This method return the due year of the company <br>

    * <b>pre:</b> dueYear is initilized, dueYear != null <br>

    * <b>post:</b> dueYear was returned <br>

    * @return String The method return the due year of the company<br>
    */

	public int getDueYear(){
		 return dueYear;
	}


	/**
    * This method set the due year of the company <br>

    * <b>pre:</b> dueYear is initilized, dueYear != null <br>

    * <b>post:</b> dueYear was changed <br>

    * @param dueYear Is the new due year<br>
    */

    public void setDueYear (int dueYear) {
	     this.dueYear = dueYear;
	}



	/**
    * This method return the mode of the company <br>

    * <b>pre:</b> mode is initilized, mode != null <br>

    * <b>post:</b> mode was returned <br>

    * @return String The method return the mode of the company<br>
    */

	public String getMode(){
		 return mode;
	}



	/**
    * This method set the mode of the company <br>

    * <b>pre:</b> mode is initilized, mode != null <br>

    * <b>post:</b> mode was changed <br>

    * @param mode Is the new mode<br>
    */

    public void setMode (String mode) {
	     this.mode = mode;
	}


	/**
    * This method calculate how many trees company has to sembrate <br>

    * <b>pre:</b> waterQuantity is initialized, waterQuantity != null <br>

    * <b>pre:</b> products is initialized, products != null <br>

    * <b>post:</b> It has been calculate how many trees company should sembrate <br>

    * @return String The method return a message with the information of how many trees company should sembrate <br>
    */

	public String naturalResourceXtree(){

		String msg = "";
		int valueToPay = 0;
		double waterQuantity = 0;

		for (int i = 0; i < getProducts().size(); i++){
			waterQuantity += getProducts().get(i).getWaterQuantity();
		}

		if(waterQuantity >= 1.0 && waterQuantity <= 140.0){

			valueToPay = 6;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		} 

		else if (waterQuantity >= 141.0 && waterQuantity <= 800.0){

			valueToPay = 25;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		else if (waterQuantity > 800.0){

			valueToPay = 200;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		return msg;
	}

}//Cierra la clase

 

