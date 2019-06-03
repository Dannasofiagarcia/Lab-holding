package model;

import java.util.*;

public class Product{

	//Atributos

	private String name;
	private String code;
	private double waterQuantity;
	private int unitsInventory;

	//Constructor

	public Product (String name, String code, double waterQuantity, int unitsInventory, Invima regulatoryInformation){

		this.name = name;
		this.code = code;
		this.waterQuantity = waterQuantity;
		this.unitsInventory = unitsInventory;
	}

	//Metodos

	public String getName(){
		 return name;
	}

    public void setName (String name) {
	     this.name = name;
	}

	public String getCode(){
		 return code;
	}

    public void setCode (String code) {
	     this.code = code;
	}

	public double getWaterQuantity(){
		return waterQuantity;
	}

	public void setWaterQuantity (double waterQuantity){
		this.waterQuantity = waterQuantity;
	}

	public int getUnitsInventory(){
		return unitsInventory;
	}

	public void setUnitsInventory(int unitsInventory){
		this.unitsInventory = unitsInventory;
	}
	}

