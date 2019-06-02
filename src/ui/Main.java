package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
    //Relaciones
	
	private Holding holding;
	private Scanner reader;


    public Main() {
		     init ();
		     reader = new Scanner (System.in);
	 }	
	

	     public static void main(String[] args) {
		     Main m = new Main (); 
		     m.showMenu();

	     }
	
	    //Creamos los objetos
	
	     public void init() { 

             Company 
             Service serviceTwelve = new Service (Service.PROPHYLAXIS, "Abril", 340, new Time (2019, 04, 16));
             myLittlePet.addService(serviceTwelve);

             Service serviceThirteen = new Service (Service.APPLICATION_VACCINES, "Abril", 900, new Time (2019, 04, 20));
             myLittlePet.addService(serviceThirteen);

	     } 
     


	     //Mostramos las opciones del menu
	
	     public void showOptions() {


		
	         System.out.println ("Bienvenido");

	         System.out.println ("Por favor, digite la opcion que desea ver");

	         System.out.println ("1. Para ver la informacion de las empresas");

	         System.out.println ("2. Para ver el historial de historias clinicas de una mascota");

	         System.out.println ("3. Para ver disponibilidad en las habitaciones");

	         System.out.println ("20. Salir");
    
	     }  



	public void showMenu (){
		
	     int userInput = 0;
	  
	     while(userInput != 20){
	
		     showOptions();	
	         userInput = reader.nextInt();
	         reader.nextLine();

	     switch (userInput){

	     	case 1: 

	     	     System.out.println (myLittlePet.showInformationOfTheClients());

	     	 break;
}