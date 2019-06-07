package model;

import java.util.*;

public class ManufacturingCompany extends Company {

	//Relaciones

	private ArrayList <Product> products;

	//Constructor

	public ManufacturingCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);

		products = new ArrayList<Product>();

	}

	//Metodos

	/**
    * This method return the products of the company <br>

    * <b>pre:</b> products is initilized, products != null <br>

    * <b>post:</b> products was returned <br>

    * @return ArrayList This method return products of the company<br>
    */

	public ArrayList<Product> getProducts(){
		 return products;
	}


	/**
    * This method set the products of the company <br>

    * <b>pre:</b> products is initilized, products != null <br>

    * <b>post:</b> products was changed <br>

    * @param products Is the new ArrayList of products <br>
    */

    public void setProducts (ArrayList<Product> products) {
	     this.products = products;
	}



}