package model;

import java.util.*;

public class Building{

	//Constantes

	public final static int NUMBER_CUBICLE = 20;

	//Atributos

	private int numberOfFloors;

	//Relaciones

	private Cublicle[][] cublicles;

	//Metodos

	/**
    * This method initialized the cublicles of building<br>

    * <b>post:</b> The cubicles get initialized with extension and availability <br>

    */

	public void cubliclesInitilized(){

		for(int f = 0; f < cublicles.length; f++){
			for (int c = 0; c < cublicles[0].length; c++){

				//false para cuando estan ocupados, true para cuando estan vacios

				cublicles[f][c] = new Cublicle(80 + f + c, true);
			}
		}
	}

	//Constructor

	public Building (int numberOfFloors){

		this.numberOfFloors = numberOfFloors;
		cublicles = new Cublicle[numberOfFloors][NUMBER_CUBICLE];
		cubliclesInitilized();
	}


	/**
    * This method return matrix cublicles<br>

    * <b>pre:</b> cublicles is initialized, cublicles != null <br>

    * <b>post:</b> cublicles was returned <br>

    * @return Cublicle[][] The method return matrix cublicles <br>
    */

	public Cublicle[][] getCublicles(){
		 return cublicles;
	}

	/**
    * This method set matrix cublicles<br>

    * <b>pre:</b> cublicles is initialized, cublicles != null <br>

    * <b>post:</b> cublicles was changed <br>

    * @param cublicles Is the new cublicle <br>

    */

    public void setCublicles (Cublicle[][] cublicles) {
	     this.cublicles = cublicles;
	}


	public void assignCublicleEmployeeName(String employeeName) {
		for (int i = 0; i < cublicles.length; i++) {
			for (int j = 0; j < cublicles[i].length; j++) {
				if (cublicles[i][j].getAvaiableCublicle() == false) {
					cublicles[i][j].setNameEmployeed(employeeName);
				}
			}
		}
	}

	public void assignCublicleEmployeeCharge(String employeeCharge) {
		for (int i = 0; i < cublicles.length; i++) {
			for (int j = 0; j < cublicles[i].length; j++) {
				if (cublicles[i][j].getAvaiableCublicle() == false) {
					cublicles[i][j].setNameEmployeed(employeeCharge);
				}
			}
		}
	}

	public void assignCublicleEmployeeEmail(String employeeEmail) {
		for (int i = 0; i < cublicles.length; i++) {
			for (int j = 0; j < cublicles[i].length; j++) {
				if (cublicles[i][j].getAvaiableCublicle() == false) {
					cublicles[i][j].setNameEmployeed(employeeEmail);
				}
			}
		}
	}
}
