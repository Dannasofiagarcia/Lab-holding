package model;

import java.util.*;

public class ServiceCompany extends Company{

	//Atributos

	private ArrayList<Poll> polls;

	//Constructor

	public ServiceCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);

	}

	//Metodos

	/**
    * This method return polls <br>

    * <b>pre:</b> polls is initilized, polls != null <br>

    * <b>post:</b> polls was returned <br>

    * @return ArrayList The method returns polls<br>
    */

	public ArrayList<Poll> getPolls(){
		 return polls;
	}


	/**
    * This method set polls <br>

    * <b>pre:</b> polls is initilized, polls != null <br>

    * <b>post:</b> polls was changed <br>

    * @param polls Is the new polls <br>
    */

	public void setPolls (ArrayList<Poll> polls) {
	     this.polls = polls;
	}


	public void addPoll(Poll poll){
		polls.add(poll);
	}


	/**
    * This method calculate clients satisfaction <br>

    * <b>pre:</b> polls is initialized, polls != null <br>

    * <b>post:</b> The satisfaction average is calculate <br>

    * @return String The method return a message with average satisfaction <br>
    */

	public String calculateClientsSatisfaction(){

		double averageAnswer1 = 0;
		double averageAnswer2 = 0;
		double averageAnswer3 = 0;
		String msg = "";

		for(int i = 0; i < polls.size(); i++){

			averageAnswer1 += polls.get(i).getAnswer1();
			averageAnswer2 += polls.get(i).getAnswer2();
			averageAnswer3 += polls.get(i).getAnswer3();
		}

		msg += ("El porcentaje de satisfaccion del servicio prestado en una escala del 1 al 5 es " + (averageAnswer1/polls.size()) + "\n" + "\n");
		msg += ("El porcentaje de satisfaccion del tiempo de respuesta en una escala del 1 al 5 es " + (averageAnswer2/polls.size()) + "\n" + "\n");
		msg += ("El porcentaje de satisfaccion de la relacion costo/beneficio del servicio prestado en una escala del 1 al 5 es " + (averageAnswer3/polls.size()) + "\n");

	return msg;

	}


}//Cierra la clase