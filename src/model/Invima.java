package model;

import java.util.*;

public class Invima{

	//Constantes

	public final static String CURRENT = "Current";
	public final static String NOT_RENEWED = "Not renewed";
	public final static String MANUFACTURING_EXPORTING = "Manufacturing and exporting";
	public final static String MANUFACTURING_SELLING = "Manufacturing and selling";
	public final static String IMPORT_SELL = "Import and sell";


	//Atributos

	private String healthRegister;
	private String status;
	private int dueMonth;
	private int dueYear;
	private String mode;

	//Constructor

	public Invima (String healthRegister, String status, int dueMonth, int dueYear, String mode){

		this.healthRegister = healthRegister;
		this.status = status;
		this.dueMonth = dueMonth;
		this.dueYear = dueYear;
		this.mode = mode;
	}

	//Metodos

	public String getHealthRegister(){
		 return healthRegister;
	}

    public void setHealthRegister (String healthRegister) {
	     this.healthRegister = healthRegister;
	}

	public String getStatus(){
		 return status;
	}

    public void setStatus (String status) {
	     this.status = status;
	}

	public int getDueMonth(){
		 return dueMonth;
	}

    public void setDueMonth (int dueMonth) {
	     this.dueMonth = dueMonth;
	}

	public int getDueYear(){
		 return dueYear;
	}

    public void setDueYear (int dueYear) {
	     this.dueYear = dueYear;
	}

	public String getMode(){
		 return mode;
	}

    public void setMode (String mode) {
	     this.mode = mode;
	}






}