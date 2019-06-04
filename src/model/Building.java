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

	public void cubliclesInitilized(){

		for(int f = 0; f < cublicles.length; f++){
			for (int c = 0; c <cublicles[0].length; c++){

				cublicles[f][c] = new Cublicle(80 + f + c, false);
			}
		}
	}

	//Constructor

	public Building (int numberOfFloors){

		this.numberOfFloors = numberOfFloors;
		cublicles = new Cublicle[numberOfFloors][NUMBER_CUBICLE];
		cubliclesInitilized();
	}

	public Cublicle[][] getCublicles(){
		 return cublicles;
	}

    public void setCublicles (Cublicle[][] cublicles) {
	     this.cublicles = cublicles;
	}
}
