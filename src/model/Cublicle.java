package model;

import java.util.*;

public class Cublicle{

	//Atributos

 	private String nameEmployeed;
 	private String chargeEmployeed;
 	private String emailEmployeed;
 	private int extension;
 	private boolean availableCublicle;

 	//Constructor

 	public Cublicle (int extension, boolean availableCublicle){

 		this.extension = extension;
 		this.availableCublicle = availableCublicle;
 	}

 	//Metodo

 	public String getNameEmployeed(){
		 return nameEmployeed;
	}

    public void setNameEMployeed (String nameEmployeed) {
	     this.nameEmployeed = nameEmployeed;
	}

	public String getChargeEmployeed(){
		 return chargeEmployeed;
	}

    public void setChargeEmployeed (String chargeEmployeed) {
	     this.chargeEmployeed = chargeEmployeed;
	}

	public String getEmailEmployeed(){
		 return emailEmployeed;
	}

    public void setEmailEmployeed (String emailEmployeed) {
	     this.emailEmployeed = emailEmployeed;
	}

	public int getExtension(){
		 return extension;
	}

    public void setExtension (int extension) {
	     this.extension = extension;
	}

	public boolean getAvaiableCublicle(){
		 return availableCublicle;
	}

    public void setAvaiableCublicle (boolean availableCublicle) {
	     this.availableCublicle = availableCublicle;
	}

 	public String haulEmailEmployeed (String chargeEmployeed){

 		String msg = "";

 		if (chargeEmployeed == this.chargeEmployeed){
 			msg += emailEmployeed + "\n";
 		}

 		return msg;
 	}

 	//Metodo para ver si el nombre del empleado esta

 	public boolean nameVerification (String nameEmployeed){

 		boolean verification = false;

 		if (nameEmployeed.equals(this.nameEmployeed)){
 			verification = true;
 		}

 		return verification;
 	}


 }