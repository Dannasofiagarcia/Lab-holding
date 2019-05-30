package model;

import java.util.*;

public abstract class Company{
	
	//Constantes

	public final static String AGRICULTURE_HUNTING_FORESTRY_FISHERIES = "AHFF";
	public final static String EXPLOTATION_MINES_QUARRIES = "EMQ";
	public final static String MANUFACTURING_INDUSTRY = "MI";
	public final static String ELECTRICITY_GAS_STEAM = "EGS";
	public final static String CONSTRUCTION = "C";
	public final static String WHOSALE_RETAIL = "WR";
	public final static String TRANSPORTATION_STORAGE_COMMUNICATIONS = "TSC";
	public final static String FINANCIAL_STATEMENTS = "FS";
	public final static String COMMUNAL_SOCIAL = "CS";

	//Atributos

	private String nameCompany;
	private String nit;
	private String correspondanceDirection;
	private int phoneNumber;
	private int quantityEmployees;
	private double activeValue;
	private String companyType;
	private String nameLR;

	//Relaciones

	private Time dateConstitution;

	//Constructor 

	public Company (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){

		this.nameCompany = nameCompany;
		this.nit = nit;
		this.correspondanceDirection = correspondanceDirection;
		this.phoneNumber = phoneNumber;
		this.quantityEmployees = quantityEmployees;
		this.activeValue = activeValue;
		this.companyType = companyType;
		this.nameLR = nameLR;
	}

	//Metodos

	public String getNameCompany(){
		 return nameCompany;
	}

    public void setNameCompany (String nameCompany) {
	     this.nameCompany = nameCompany;
	}

	public String getNit(){
		 return nit;
	}

    public void setNit (String nit) {
	     this.nit = nit;
	}

	public String getCorrespondanceDirection(){
		 return correspondanceDirection;
	}

    public void setCorrespondanceDirection (String correspondanceDirection) {
	     this.correspondanceDirection = correspondanceDirection;
	}
	
	public int getPhoneNumber(){
		 return phoneNumber;
	}

    public void setPhoneNumber (int phoneNumber) {
	     this.phoneNumber = phoneNumber;
	}

	public int getQuantityEmployees(){
		 return quantityEmployees;
	}

    public void setQuantityEmployees (int quantityEmployees) {
	     this.quantityEmployees = quantityEmployees;
	}

	public double getActiveValue(){
		 return activeValue;
	}

    public void setActiveValue (double activeValue) {
	     this.activeValue = activeValue;
	}

	public String getCompanyType(){
		 return companyType;
	}

    public void setCompanyType (String companyType) {
	     this.companyType = companyType;
	}


	public String getNameLR(){
		 return nameLR;
	}

    public void setNameLR (String nameLR) {
	     this.nameLR = nameLR;
	}


	public Time getDateConstitution(){
		 return dateConstitution;
	}

    public void setDateConstitution (Time dateConstitution) {
	     this.dateConstitution = dateConstitution;
	}
}


