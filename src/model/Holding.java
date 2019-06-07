package model;

import java.util.*;

public class Holding implements HaulBuilding{

	//Atributos

	private String name;

	//Relaciones

	private ArrayList<Company> companies;
	private Building building;
	
	//Constructor

	public Holding (){

		companies = new ArrayList<Company>();
	}

	//Metodos

	/**
    * This method return the name of the holding <br>

    * <b>pre:</b> name is initialized, name != null <br>

    * <b>post:</b> The name was returned <br>

    * @return String The method return the name of the holding <br>
    */

	public String getName(){
		return name;
	}


	/**
    * This method set the name of the holding <br>

    * <b>pre:</b> name is initialized, name != null <br>

    * <b>post:</b> The name was changed <br>

	* @param name Is the new name <br> 
    */

	public void setName(String name){
		this.name = name;
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


	public
    
} //cierra la clase