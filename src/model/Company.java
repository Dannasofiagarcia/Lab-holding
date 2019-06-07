package model;

import java.util.*;

public abstract class Company implements HaulBuilding{
	
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
	//legal representative

	//Relaciones

	private Time dateConstitution;
	private Building building;

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

	/**
    * This method return the name of the company <br>

    * <b>pre:</b> nameCompany is initilized, nameCompany != null <br>

    * <b>post:</b> nameCompany was returned <br>

    * @return String The method returns true the name of the company <br>
    */

	public String getNameCompany(){
		 return nameCompany;
	}


	/**
    * This method set the name of the company <br>

    * <b>pre:</b> nameCompany is initilized, nameCompany != null <br>

    * <b>post:</b> nameCompany was changed <br>

	* @param nameCompany Is the new name <br>
    */

    public void setNameCompany (String nameCompany) {
	     this.nameCompany = nameCompany;
	}


	/**
    * This method return the nit of the company <br>

    * <b>pre:</b> nit is initilized, nit != null <br>

    * <b>post:</b> nit was returned <br>

    * @return String The method returns the nit of the company<br>
    */

	public String getNit(){
		 return nit;
	}


	/**
    * This method set the nit of the company <br>

    * <b>pre:</b> nit is initilized, nit != null <br>

    * <b>post:</b> nit was changed <br>

    * @param nit Is the new nit <br>
    */

    public void setNit (String nit) {
	     this.nit = nit;
	}


	/**
    * This method return the correspondance direction of the company <br>

    * <b>pre:</b> correspondanceDirection is initilized, correspondanceDirection != null <br>

    * <b>post:</b> correspondanceDirection was returned <br>

    * @return String The method returns the correspondance direction of the company<br>
    */

	public String getCorrespondanceDirection(){
		 return correspondanceDirection;
	}


	/**
    * This method set the correspondance direction of the company <br>

    * <b>pre:</b> correspondanceDirection is initilized, correspondanceDirection != null <br>

    * <b>post:</b> correspondanceDirection was changed <br>

    * @param correspondanceDirection Is the new correspondance direction <br>
    */

    public void setCorrespondanceDirection (String correspondanceDirection) {
	     this.correspondanceDirection = correspondanceDirection;
	}


	/**
    * This method return the phone number of the company <br>

    * <b>pre:</b> phoneNumber is initilized, phoneNumber != null <br>

    * <b>post:</b> phoneNumber was returned <br>

    * @return int The method returns the phone number of the company<br>
    */
	
	public int getPhoneNumber(){
		 return phoneNumber;
	}


	/**
    * This method set the phone number of the company <br>

    * <b>pre:</b> phoneNumber is initilized, phoneNumber != null <br>

    * <b>post:</b> phoneNumber was changed <br>

    * @param phoneNumber Is the new number<br>
    */

    public void setPhoneNumber (int phoneNumber) {
	     this.phoneNumber = phoneNumber;
	}


	/**
    * This method return the quantityEmployees of the company <br>

    * <b>pre:</b> quantityEmployees is initilized, quantityEmployees != null <br>

    * <b>post:</b> quantityEmloyees was returned <br>

    * @return int The method returns the nit of the company<br>
    */

	public int getQuantityEmployees(){
		 return quantityEmployees;
	}


	/**
    * This method set the quantityEmployees of the company <br>

    * <b>pre:</b> quantityEmployees is initilized, quantityEmployees != null <br>

    * <b>post:</b> quantityEmloyees was changed <br>

    * @param quantityEmployees Is the new quantity of employees <br>
    */

    public void setQuantityEmployees (int quantityEmployees) {
	     this.quantityEmployees = quantityEmployees;
	}


	/**
    * This method return active value of the company <br>

    * <b>pre:</b> activeValue is initilized, activeValue != null <br>

    * <b>post:</b> activeValue was returned <br>

    * @return double The method returns active value of the company<br>
    */

	public double getActiveValue(){
		 return activeValue;
	}


	/**
    * This method set active value of the company <br>

    * <b>pre:</b> activeValue is initilized, activeValue != null <br>

    * <b>post:</b> activeValue was changed <br>

    * @param activeValue Is the new active value <br>
    */

    public void setActiveValue (double activeValue) {
	     this.activeValue = activeValue;
	}


	/**
    * This method return the type of the company <br>

    * <b>pre:</b> companyType is initilized, companyType != null <br>

    * <b>post:</b> companyType was returned <br>

    * @return String The method returns the type of the company<br>
    */

	public String getCompanyType(){
		 return companyType;
	}


	/**
    * This method set the type of the company <br>

    * <b>pre:</b> companyType is initilized, companyType != null <br>

    * <b>post:</b> companyType was changed <br>

    * @param companyType Is the new type <br>
    */

    public void setCompanyType (String companyType) {
	     this.companyType = companyType;
	}


	/**
    * This method return the name of the legal representative of the company <br>

    * <b>pre:</b> nameLR is initilized, nameLR != null <br>

    * <b>post:</b> nameLR was returned <br>

    * @return String The method returns the name of the legal representative of the company<br>
    */

	public String getNameLR(){
		 return nameLR;
	}


	/**
    * This method set the name of the legal representative of the company <br>

    * <b>pre:</b> nameLR is initilized, nameLR != null <br>

    * <b>post:</b> nameLR was changed <br>

    * @param nameLR Is the new name of the legal representative <br>
    */

    public void setNameLR (String nameLR) {
	     this.nameLR = nameLR;
	}


	/**
    * This method return the date of constitution of the company <br>

    * <b>pre:</b> dateConstitution is initilized, dateConstitution != null <br>

    * <b>post:</b> dateConstitution was returned <br>

    * @return String The method returns the date of constitution of the company<br>
    */

	public Time getDateConstitution(){
		 return dateConstitution;
	}


	/**
    * This method set the date of constitution of the company <br>

    * <b>pre:</b> dateConstitution is initilized, dateConstitution != null <br>

    * <b>post:</b> dateConstitution was changed <br>

    * @param dateConstitution Is the new date of constitution <br>
    */

    public void setDateConstitution (Time dateConstitution) {
	     this.dateConstitution = dateConstitution;
	}


	/**
    * This method search the email of an specific charge <br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>post:</b> The email of the employeed was showed <br>

    * @param chargeEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the email of employeed <br>
    */

	public String haulEmail(String chargeEmployeed){

		int filas = 0;
		int columnas = 0;
		int numCeldas = 0;
		int totalCeldas = (building.getCublicles().length * building.getCublicles()[0].length);
		int minY = 0;
		int minX = 0;
		int maxY = building.getCublicles().length-1;
		int maxX = building.getCublicles()[0].length-1;
		int direccion = HaulBuilding.ABAJO;
		String msg = "";

		while (numCeldas < totalCeldas){

			switch (direccion){

				case HaulBuilding.ABAJO:

					filas++;
					if(filas == maxY){
						direccion = HaulBuilding.DERECHA;
						minX++;
					}

					msg += building.getCublicles()[filas][columnas].haulEmailEmployeed(chargeEmployeed) + "\n";

				break;

				case HaulBuilding.DERECHA:

					columnas++;
					if (columnas == maxX){
						direccion = HaulBuilding.ARRIBA;
						maxY--;
					}

					msg += building.getCublicles()[filas][columnas].haulEmailEmployeed(chargeEmployeed) + "\n";

				break;

				case HaulBuilding.ARRIBA:
					filas--;
					if (filas == minY){
						direccion = HaulBuilding.IZQUIERDA;
						maxX--;
					}

					msg += building.getCublicles()[filas][columnas].haulEmailEmployeed(chargeEmployeed) + "\n";

				break;

				case HaulBuilding.IZQUIERDA:
					columnas--;
					if (columnas == minX){
						direccion = HaulBuilding.ABAJO;
						minY++;
					}

					msg += building.getCublicles()[filas][columnas].haulEmailEmployeed(chargeEmployeed) + "\n";

				break;

			}
		}

		return msg;
	}


	/**
    * This method search the extension of an specific employeed with the name, making letter L <br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>pre:</b> Method nameVerification already exist <br>

    * <b>post:</b> The extension of the employeed was showed <br>

    * @param nameEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the name and the extension of the employeed <br>
    */

	public String haulExtensionL (String nameEmployeed){

		String msg = "";

		//Recorrido de la primera columna, mientras que la columna sea 0 que las filas vayan aumentando.

		for(int filas = 0; filas < building.getCublicles().length; filas++){
			if(building.getCublicles()[0][filas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][filas].getExtension();

			}
		}

		//Recorrido de la ultima fila, mientras que las columnas aumentan la fila siempre es la última 

		for (int columnas = 0; columnas < building.getCublicles()[0].length; columnas++){
			if(building.getCublicles()[building.getCublicles().length-1][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[building.getCublicles().length-1][columnas].getExtension();
			}
		}

		return msg;	
	}


	/**
    * This method search the extension of an specific employeed with the name, making letter O <br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>pre:</b> Method nameVerification already exist <br>

    * <b>post:</b> The extension of the employeed was showed <br>

    * @param nameEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the name and the extension of the employeed <br>
    */

	public String haulExtensionO (String nameEmployeed){

		String msg = "";

		//Recorrido de la primera columna, mientras que la columna sea 0 que las filas vayan aumentando.

		for(int filas = 0; filas < building.getCublicles().length; filas++){
			if(building.getCublicles()[filas][0].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[filas][0].getExtension();

			}
		}
 
		//Recorrido de la ultima fila, mientras que la columnas aumentan la fila siempre es la última 

		for (int columnas = 0; columnas < building.getCublicles()[0].length; columnas++){
			if(building.getCublicles()[building.getCublicles().length-1][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[building.getCublicles().length-1][columnas].getExtension();
			}
		}

		//Recorrido de la ultima columna, hacia arriba. En la última columna, las filas disminuyen

		for(int filas = building.getCublicles().length-1; filas == 0; filas--){
			if(building.getCublicles()[filas][building.getCublicles().length-1].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[filas][building.getCublicles().length-1].getExtension();

			}
		} 

		//Recorrido de la primera fila, mientras que la fila siempre es la primera, las columnas disminuyen
  
		for (int columnas = building.getCublicles()[0].length-1; columnas == 0; columnas--){
			if(building.getCublicles()[0][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][columnas].getExtension();
			}
		}

		return msg;
	}



	/**
    * This method search the extension of an specific employeed with the name, making letter E <br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>pre:</b> Method nameVerification already exist <br>

    * <b>post:</b> The extension of the employeed was showed <br>

    * @param nameEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the name and the extension of the employeed <br>
    */

	public String haulExtensionE (String nameEmployeed){

		int filas = 0;
		int columnas = 0;
		String msg = "";

		if(filas % 2 == 0){

			//recorre la fila de derecha a izquierda
  			while (filas < building.getCublicles().length){
				while (columnas < building.getCublicles()[0].length){
					if(building.getCublicles()[filas][columnas].nameVerification(nameEmployeed) == true){
						msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[filas][columnas].getExtension();
						filas++;
						columnas++;
					}
				}
			}
		}

		else if(filas % 2 != 0){

			//recorre la fila de izquierda a derecha
			columnas = building.getCublicles()[0].length-1;
  			while (filas < building.getCublicles().length){
				while (columnas == 0){
					if(building.getCublicles()[filas][columnas].nameVerification(nameEmployeed) == true){
						msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[filas][columnas].getExtension();
						filas++;
						columnas--;

					}
				}
			}
		}

		return msg;		
	}


	/**
    * This method search the extension of an specific employeed with the name, making letter Z <br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>pre:</b> Method nameVerification already exist <br>

    * <b>post:</b> The extension of the employeed was showed <br>

    * @param nameEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the name and the extension of the employeed <br>
    */

	public String haulExtensionZ (String nameEmployeed){

		String msg = "";

	//Recorrido de la primera fila

	for (int columnas = 0; columnas < building.getCublicles().length; columnas++){
		if(building.getCublicles()[0][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][columnas].getExtension();
		}
	}	

	//Recorrido diagonal inversa

	for (int columnas = building.getCublicles()[0].length; columnas == 0; columnas--){
		for (int filas = 0; filas < building.getCublicles().length; filas++){
			if(building.getCublicles()[0][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][columnas].getExtension();
			}
		}
	}

	//Recorrido ultima fila, de derecha a izquierda

	for (int columnas = building.getCublicles()[0].length; columnas == 0; columnas--){
		if(building.getCublicles()[building.getCublicles().length][columnas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[building.getCublicles().length][columnas].getExtension();
		}
	}

	return msg;		

	}


	/**
    * This method search the extension of an specific employeed with the name, making letter X<br>

    * <b>pre:</b> building is initialized, building != null <br>

    * <b>pre:</b> Method nameVerification already exist <br>

    * <b>post:</b> The extension of the employeed was showed <br>

    * @param nameEmployeed Is the name of the employeed whose extension method are looking for <br>

    * @return String The method return a message with the name and the extension of the employeed <br>
    */

    public String haulExtensionX(String nameEmployeed){

    	String msg = "";

    	//Diagonal

		for (int filas = 0; filas < building.getCublicles().length; filas++){
			if(building.getCublicles()[filas][filas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[filas][filas].getExtension();
			}			
		}

		//Diagonal inversa

		for (int columnas = building.getCublicles()[0].length; columnas == 0; columnas--){
			for (int filas = 0; filas < building.getCublicles().length; filas++){
				if(building.getCublicles()[0][columnas].nameVerification(nameEmployeed) == true){
					msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][columnas].getExtension();
				}
			}
		}

		return msg;
	}
}//Cierra la clase


