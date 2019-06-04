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

    * <b>post:</b> The name is returned <br>

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

		//Recorrido de la fila columna, mientras que las columnas aumentan la fila siempre es la última 

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
} //cierra la clase