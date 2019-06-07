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

 	//Metodos

 	/**
    * This method return the name of the employeed <br>

    * <b>pre:</b> nameEmployeed is initialized, nameEmployeed != null <br>

    * <b>post:</b> nameEmployeed was returned <br>

    * @return String The method returns the name of the employeed <br>
    */

 	public String getNameEmployeed(){
		 return nameEmployeed;
	}


	/**
    * This method set the name of the employeed <br>

    * <b>pre:</b> nameEmployeed is initialized, nameEmployeed != null <br>

    * <b>post:</b> nameEmployeed was changed <br>

    * @param nameEmployeed Is the new name <br>
    */

    public void setNameEMployeed (String nameEmployeed) {
	     this.nameEmployeed = nameEmployeed;
	}


	/**
    * This method return the charge of the employeed <br>

    * <b>pre:</b> chargeEmployeed is initialized, chargeEmployeed != null <br>

    * <b>post:</b> chargeEmployeed was returned <br>

    * @return String The method returns the charge of the employeed <br>
    */

	public String getChargeEmployeed(){
		 return chargeEmployeed;
	}


	/**
    * This method set the charge of the employeed <br>

    * <b>pre:</b> chargeEmployeed is initialized, chargeEmployeed != null <br>

    * <b>post:</b> chargeEmployeed was changed <br>

    * @param chargeEmployeed is the new charge <br>

    */

    public void setChargeEmployeed (String chargeEmployeed) {
	     this.chargeEmployeed = chargeEmployeed;
	}


	/**
    * This method return the email of the employeed <br>

    * <b>pre:</b> emailEmployeed is initialized, emailEmployeed != null <br>

    * <b>post:</b> emailEmployeed was returned <br>

    * @return String The method returns the email of the employeed <br>
    */

	public String getEmailEmployeed(){
		 return emailEmployeed;
	}


	/**
    * This method set the email of the employeed <br>

    * <b>pre:</b> emailEmployeed is initialized, emailEmployeed != null <br>

    * <b>post:</b> emailEmployeed was changed <br>

    * @param emailEmployeed Is the new email <br>
    */

    public void setEmailEmployeed (String emailEmployeed) {
	     this.emailEmployeed = emailEmployeed;
	}


	/**
    * This method return the extension of the employeed <br>

    * <b>pre:</b> extension is initialized, extension != null <br>

    * <b>post:</b> extension was returned <br>

    * @return String The method returns the extension of the employeed <br>
    */

	public int getExtension(){
		 return extension;
	}


	/**
    * This method set the extension of the employeed <br>

    * <b>pre:</b> extension is initialized, extension != null <br>

    * <b>post:</b> extension was changed <br>

    * @param extension Is the new extension <br>
    */	

    public void setExtension (int extension) {
	     this.extension = extension;
	}

	/**
    * This method return the availability of the cublicle <br>

    * <b>pre:</b> avaiableCublicle is initialized, avaiableCublicle != null <br>

    * <b>post:</b> avaiableCublicle was returned <br>

    * @return boolean The method returns true if the cublicle is avaiable, and false if is not <br>
    */

	public boolean getAvaiableCublicle(){
		 return availableCublicle;
	}


	/**
    * This method set the availability of the cublicle <br>

    * <b>pre:</b> avaiableCublicle is initialized, avaiableCublicle != null <br>

    * <b>post:</b> avaiableCublicle was changed <br>

    * @param availableCublicle is the new availability <br>
    */	

    public void setAvaiableCublicle (boolean availableCublicle) {
	     this.availableCublicle = availableCublicle;
	}

	/**
    * This method check if the charge in param match with the charge of the employeed in the cublicle <br>

    * <b>pre:</b> this.chargeEmployeed is initialized, this.chargeEmployeed != null <br>

    * <b>post:</b> The email of the employeed is returned <br>

    * @param chargeEmployeed Is the charge of the employeed we are looking for <br>

    * @return String The method returns a message with the email of the employeed <br>
    */

 	public String haulEmailEmployeed (String chargeEmployeed){

 		String msg = "";

 		if (chargeEmployeed == this.chargeEmployeed){
 			msg += emailEmployeed + "\n";
 		}

 		return msg;
 	}


 	/**
    * This method check if the name of the param match with the name of the employeed in the cublicle <br>

    * <b>pre:</b> this.nameEmployeed is initialized, this.nameEmployeed != null <br>

    * <b>post:</b> The method check and return true if the name match <br>

    * @param nameEmployeed Is the name of the employeed we are looking for <br>

    * @return boolean The method returns a true if the name match, and false if not <br>
    */

 	public boolean nameVerification (String nameEmployeed){

 		boolean verification = false;

 		if (nameEmployeed.equals(this.nameEmployeed)){
 			verification = true;
 		}

 		return verification;
 	}


 }//Cierra la clase