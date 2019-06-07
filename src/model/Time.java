package model;

import java.util.*;

public class Time{

	 //Atributos
	 
	 private int month;
	 private int day;
	 private int year;
	 
	 
	 //Constructor
	 
    public Time (int year, int month, int day){
	
	this.year = year;
	this.month = month;
	this.day = day;
	}

	
	//Metodos

	/**
    * This method return the month<br>

    * <b>pre:</b> month is initilized, month != null <br>

    * <b>post:</b> month was returned <br>

    * @return int The method return the month of the company<br>
    */
	 
	 public int getMonth() {
		return month;
	}


	/**
    * This method set the month<br>

    * <b>pre:</b> month is initilized, month != null <br>

    * <b>post:</b> month was changed <br>

    * @param month Is the new month<br>
    */

    public void setMonth (int month){
	    this.month = month;
	}


	/**
    * This method return the day<br>

    * <b>pre:</b> day is initilized, day != null <br>

    * <b>post:</b> day was returned <br>

    * @return int The method return the day <br>
    */

    public int getDay() {
		return day;
	}


	/**
    * This method set the day<br>

    * <b>pre:</b> day is initilized, day != null <br>

    * <b>post:</b> day was changed <br>

    * @param day Is the new day<br>
    */

    public void setDay (int day){
	    this.day = day;
	}


	/**
    * This method return the year<br>

    * <b>pre:</b> year is initilized, year != null <br>

    * <b>post:</b> year was returned <br>

    * @return int The method return the year<br>
    */
	
	public int getYear() {
		return year;
	}


	/**
    * This method set the year<br>

    * <b>pre:</b> year is initilized, year != null <br>

    * <b>post:</b> year was changed <br>

    * @param year Is the new year<br>
    */

    public void setYear (int year){
	    this.year = year;
	}
	

}
