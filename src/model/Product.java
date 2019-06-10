package model;

import java.util.*;

public class Product{

	//Atributos

	private String name;
	private String code;
	private double waterQuantity;
	private int unitsInventory;

	//Constructor

	public Product (String name, String code, double waterQuantity, int unitsInventory){

		this.name = name;
		this.code = code;
		this.waterQuantity = waterQuantity;
		this.unitsInventory = unitsInventory;
	}

	//Metodos

	/**
    * This method return the name of the product <br>

    * <b>pre:</b> name is initilized, name != null <br>

    * <b>post:</b> name was returned <br>

    * @return String The method return the name of the product<br>
    */

	public String getName(){
		 return name;
	}


	/**
    * This method set the name of the product <br>

    * <b>pre:</b> name is initilized, name != null <br>

    * <b>post:</b> name was changed <br>

    * @param name Is the new name<br>
    */

    public void setName (String name) {
	     this.name = name;
	}


	/**
    * This method return the code of the product <br>

    * <b>pre:</b> code is initilized, code != null <br>

    * <b>post:</b> code was returned <br>

    * @return String The method return the code of the product<br>
    */

	public String getCode(){
		 return code;
	}


	/**
    * This method set the code of the product <br>

    * <b>pre:</b> code is initilized, code != null <br>

    * <b>post:</b> code was changed <br>

    * @param code Is the new code<br>
    */

    public void setCode (String code) {
	     this.code = code;
	}


	/**
    * This method return the quantity of water of the product <br>

    * <b>pre:</b> waterQuantity is initilized, waterQuantity != null <br>

    * <b>post:</b> waterQuantity was returned <br>

    * @return String The method return the waterQuantity of the product<br>
    */

	public double getWaterQuantity(){
		return waterQuantity;
	}


	/**
    * This method set the quantity of water of the product <br>

    * <b>pre:</b> waterQuantity is initilized, waterQuantity != null <br>

    * <b>post:</b> waterQuantity was changed <br>

    * @param waterQuantity Is the new quantity of water<br>
    */

	public void setWaterQuantity (double waterQuantity){
		this.waterQuantity = waterQuantity;
	}


	/**
    * This method return the units on inventory of the product <br>

    * <b>pre:</b> unitsInventory is initilized, unitsInventory != null <br>

    * <b>post:</b> unitsInventory was returned <br>

    * @return int The method return the units on inventory of the product<br>
    */

	public int getUnitsInventory(){
		return unitsInventory;
	}

	/**
    * This method set the units on inventory of the product <br>

    * <b>pre:</b> unitsInventory is initilized, unitsInventory != null <br>

    * <b>post:</b> unitsInventory was changed <br>

    * @param unitsInventory Are the new units on inventory<br>
    */

	public void setUnitsInventory(int unitsInventory){
		this.unitsInventory = unitsInventory;
	}
}

