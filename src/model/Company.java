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


	/**
    * This method calculate how many trees company has to sembrate <br>

    * <b>pre:</b> energy is initialized, energy != null <br>

    * <b>post:</b> It has been calculate how many trees company should sembrate <br>

    * @return String The method return a message with the information of how many trees company should sembrate <br>
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
    * This method search the extension of an specific employeed with the name, making a L <br>

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

		//Recorrido de la ultima columna,

		for (int columnas = 0; columnas < building.getCublicles()[0].length; columnas++){
			if(building.getCublicles()[columnas][building.getCublicles().length-1].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[columnas][building.getCublicles().length-1].getExtension();
			}
		}

		return msg;	
	}
	

	public String haulExtensionO (String nameEmployeed){

		String msg = "";

		//Recorrido de la primera columna, mientras que la columna sea 0 que las filas vayan aumentando.

		for(int filas = 0; filas < building.getCublicles().length; filas++){
			if(building.getCublicles()[0][filas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[0][filas].getExtension();

			}
		}

		//Recorrido de la ultima fila, mientras que la columnas aumentan la fila siempre es la última 

		for (int columnas = 0; columnas < building.getCublicles()[0].length; columnas++){
			if(building.getCublicles()[columnas][building.getCublicles().length-1].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[columnas][building.getCublicles().length-1].getExtension();
			}
		}

		//Recorrido de la ultima columna, hacia arriba. En la última columna, las filas disminuyen

		for(int filas = building.getCublicles().length-1; filas == 0; filas--){
			if(building.getCublicles()[building.getCublicles().length-1][filas].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[building.getCublicles().length-1][filas].getExtension();

			}
		} 

		//Recorrido de la primera fila, mientras que la fila siempre es la primera, las columnas disminuyen
  
		for (int columnas = building.getCublicles()[0].length-1; columnas == 0; columnas--){
			if(building.getCublicles()[columnas][0].nameVerification(nameEmployeed) == true){
				msg = "La extension del empleado " + nameEmployeed + " es " + building.getCublicles()[columnas][0].getExtension();
			}
		}

		return msg;
	}
}//Cierra la clase


