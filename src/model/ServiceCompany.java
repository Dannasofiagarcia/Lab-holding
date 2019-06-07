package model;

import java.util.*;

public class ServiceCompany extends Company{

	//Atributos

	private ArrayList<int> answersSatisfactionClients;
	private double promedioSatisfaccionClientes;

	//Constructor

	public ServiceCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);

	}

	//Metodos

	
	/**
    * This method return the answer of satisfaction of the company <br>

    * <b>pre:</b> answersSatisfactionClients is initilized, answerSatisfactionClients != null <br>

    * <b>post:</b> answerSatisfactionClients was returned <br>

    * @return String The method returns the answer of satisfaction of the company<br>
    */

	public ArrayList<int> getAnswersSatisfactionClients(){
		 return answersSatisfactionClients;
	}


	/**
    * This method set the answer of satisfaction of the company <br>

    * <b>pre:</b> answersSatisfactionClients is initilized, answerSatisfactionClients != null <br>

    * <b>post:</b> answerSatisfactionClients was changed <br>

    * @return String The method set the answer of satisfaction of the company<br>
    */

	public void setAnswersSatisfactionClients (ArrayList<int> answerSatisfactionClients) {
	     this.answerSatisfactionClients = answerSatisfactionClients;
	}

}