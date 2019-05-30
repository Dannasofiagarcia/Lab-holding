package model;

import java.util.*;

public class TecnologyCompany extends ServiceCompany{

	//Constantes

	public final static String CONSULTING = "Consulting";
	public final static String TRAINING = "Training";
	public final static String SOFTWARE_DEVELOPMENT = "Software development";
	public final static String INFRAESTRUCTURE = "Infraestructure";
	public final static String SOFTWARE_SERVICE = "Software service";
	public final static String PLATFORM = "Platform";

	//Atributos

	private String service;


	//Constructor

	public TecnologyCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution, String service){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.service = service;
	}

	//Metodos

	public String getService(){
		 return service;
	}

    public void setService (String service) {
	     this.service = service;
	}


}
