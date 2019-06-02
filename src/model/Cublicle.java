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

 	public String haulEmailEmployeed (String chargeEmployeed){

 		String msg = "";

 		if (chargeEmployeed == this.chargeEmployeed){
 			msg += emailEmployeed + "\n";
 		}

 		return msg;
 	}
 }