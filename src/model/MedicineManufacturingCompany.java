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

	public String getHealthRegister(){
		 return healthRegister;
	}

    public void setHealthRegister (String healthRegister) {
	     this.healthRegister = healthRegister;
	}

	public String getStatus(){
		 return status;
	}

    public void getStatus (String status) {
	     this.status = status;
	}

	public int getDueMonth(){
		 return dueMonth;
	}

    public void setDueMonth (int dueMonth) {
	     this.dueMonth = dueMonth;
	}

	public int getDueYear(){
		 return dueYear;
	}

    public void setDueYear (int dueYear) {
	     this.dueYear = dueYear;
	}

	public String getMode(){
		 return mode;
	}

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

 

