package model;

import java.util.*;

public class MedicationCompany extends ManufacturingCompany{

	//Relaciones

	private ArrayList <Product> products;


	//Constructor

	public MedicationCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);

		products = new ArrayList<Product>();

	}

	//Metodos

	public ArrayList<Product> getProducts(){
		 return products;
	}

    public void setProducts (ArrayList<Product> products) {
	     this.products = products;
	}



}  

