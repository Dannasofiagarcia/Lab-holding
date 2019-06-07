package model;

public class FoodManufacturingCompany{
	
	 //Atributos

	private String healthRegister;
	private String status;
	private int dueMonth;
	private int dueYear;
	private String mode;
	private int elaborationMonth;
	private int elaborationYear;
	private String comercialBrandName;


	//Constructor

	public ManufacturingCompany (String nameCompany, String nit, String correspondanceDirection, int phoneNumber, int quantityEmployees, double activeValue, String companyType, String nameLR, Time dateConstitution,
								 String healthRegister, String status, int dueMonth, int dueYear, String mode, int eleaborationMonth, int elaborationYear, String comercialBrandName){
		
		super(nameCompany, nit, correspondanceDirection, phoneNumber, quantityEmployees, activeValue, companyType, nameLR, dateConstitution);
		this.healthRegister = healthRegister;
		this.status = status;
		this.dueMonth = dueMonth;
		this.dueYear = dueYear;
		this.mode = mode;
		this.elaborationMonth = elaborationMonth;
		this.elaborationYear = elaborationYear;
		this.comercialBrandName = comercialBrandName;
	}


	//Metodos

	/**
    * This method return the health register of the company <br>

    * <b>pre:</b> healthRegister is initilized, healthRegister != null <br>

    * <b>post:</b> healthRegister was returned <br>

    * @return String The method return the health register of the company<br>
    */

	public String getHealthRegister(){
		 return healthRegister;
	}


	/**
    * This method set the health register of the company <br>

    * <b>pre:</b> healthRegister is initilized, healthRegister != null <br>

    * <b>post:</b> healthRegister was changed <br>

    * @param healthRegister Is the new health register <br>
    */

    public void setHealthRegister (String healthRegister) {
	     this.healthRegister = healthRegister;
	}


	/**
    * This method return the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was returned <br>

    * @return String The method return status of the company<br>
    */

	public String getStatus(){
		 return status;
	}


	/**
    * This method set the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was changed <br>

    * @param status Is the new status<br>
    */

    public void getStatus (String status) {
	     this.status = status;
	}


	/**
    * This method return the due month of the company <br>

    * <b>pre:</b> dueMonth is initilized, dueMonth != null <br>

    * <b>post:</b> dueMonth was returned <br>

    * @return int The method return the due month of the company<br>
    */

	public int getDueMonth(){
		 return dueMonth;
	}


	/**
    * This method set the status of the company <br>

    * <b>pre:</b> status is initilized, status != null <br>

    * <b>post:</b> status was changed <br>

    * @param dueMonth Is the new due month<br>
    */

    public void setDueMonth (int dueMonth) {
	     this.dueMonth = dueMonth;
	}


	/**
    * This method return the due year of the company <br>

    * <b>pre:</b> dueYear is initilized, dueYear != null <br>

    * <b>post:</b> dueYear was returned <br>

    * @return String The method return the due year of the company<br>
    */

	public int getDueYear(){
		 return dueYear;
	}


	/**
    * This method set the due year of the company <br>

    * <b>pre:</b> dueYear is initilized, dueYear != null <br>

    * <b>post:</b> dueYear was changed <br>

    * @param dueYear Is the new due year<br>
    */

    public void setDueYear (int dueYear) {
	     this.dueYear = dueYear;
	}



	/**
    * This method return the mode of the company <br>

    * <b>pre:</b> mode is initilized, mode != null <br>

    * <b>post:</b> mode was returned <br>

    * @return String The method return the mode of the company<br>
    */

	public String getMode(){
		 return mode;
	}



	/**
    * This method set the mode of the company <br>

    * <b>pre:</b> mode is initilized, mode != null <br>

    * <b>post:</b> mode was changed <br>

    * @param mode Is the new mode<br>
    */

    public void setMode (String mode) {
	     this.mode = mode;
	}


	/**
    * This method return the elaboration month of the company <br>

    * <b>pre:</b> elaborationMonth is initilized, elaborationMonth != null <br>

    * <b>post:</b> elaborationMonth was returned <br>

    * @return int The method return the elaboration month of the company<br>
    */

	public int getElaborationMonth(){
		 return elaborationMonth;
	}


	/**
    * This method set the elaboration month of the company <br>

    * <b>pre:</b> elaborationMonth is initilized, elaborationMonth != null <br>

    * <b>post:</b> elaborationMonth was changed <br>

    * @param elaborationMonth Is the new elaboration month of the company<br>
    */

	public void setElaborationMonth (int elaborationMonth) {
	     this.elaborationMonth = elaborationMonth;
	}


	/**
    * This method return the elaboration year of the company <br>

    * <b>pre:</b> elaborationYear is initilized, elaborationYear != null <br>

    * <b>post:</b> elaborationYear was returned <br>

    * @return int The method return the elaboration year of the company<br>
    */

	public int getElaborationYear(){
		 return elaborationYear;
	}


	/**
    * This method set the elaboration year of the company <br>

    * <b>pre:</b> elaborationYear is initilized, elaborationYear != null <br>

    * <b>post:</b> elaborationYear was changed <br>

    * @param elaborationYear Is the new year elaboration of the company<br>
    */

	public void setElaborationYear (int elaborationYear) {
	     this.elaborationYear = elaborationYear;
	}


	/**
    * This method return the name of the comercial brand of the company <br>

    * <b>pre:</b> comercialBrandName is initilized, comercialBrandName != null <br>

    * <b>post:</b> comercialBrandName was returned <br>

    * @return int The method return the name of the comercial brand of the company<br>
    */

	public String getComercialBrandName(){
		 return comercialBrandName;
	}


	/**
    * This method set the name of the comercial brand of the company <br>

    * <b>pre:</b> comercialBrandName is initilized, comercialBrandName != null <br>

    * <b>post:</b> comercialBrandName was changed <br>

    * @param comercialBrandName Is the new name of the comercial brand<br>
    */

	public void setComercialBrandName (String comercialBrandName) {
	     this.comercialBrandName = comercialBrandName;
	}


}