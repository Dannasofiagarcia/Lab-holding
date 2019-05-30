package model;

import java.util.*;

public class ManufacturingCompany extends Company{

	//Relaciones

	private Product products;

	//Constructor

	public ManufacturingCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);

	}

	//Metodos

	/**
    * This method calculate how many trees company has to sembrate <br>

    * <b>pre:</b> waterQuantity is initialized, waterQuantity != null <br>

    * <b>post:</b> It has been calculate how many trees company should sembrate <br>

    * @return String The method return a message with the information of how many trees company should sembrate <br>
    */

	public String waterXtree(){

		String msg = "";
		int valueToPay = 0;

		if(products.getWaterQuantity() >= 1.0 && products.getWaterQuantity() <= 140.0){

			valueToPay = 6;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		} 

		else if (products.getWaterQuantity() >= 141.0 && products.getWaterQuantity() <= 800.0){

			valueToPay = 25;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		else if (products.getWaterQuantity() > 800.0){

			valueToPay = 200;
			msg = ("Los arboles que la empresa debe sembrar son " + valueToPay);
		}

		return msg;
	}

}