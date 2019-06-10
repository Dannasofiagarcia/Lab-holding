package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
      //Relaciones
	
	private Holding holdingSA;
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

           holdingSA = new Holding ("Holding S.A");

           MedicineManufacturingCompany eucerin = new MedicineManufacturingCompany ("Eucerin", "672356890", "street 24 55", 3456543, 2344, 300000000.0, Company.MANUFACTURING_INDUSTRY, "Thomas Edson", new Time(1996, 07, 06),
                                                                               "INVIMA 2006M-003807 -R1", MedicineManufacturingCompany.CURRENT, 12, 2022, MedicineManufacturingCompany.MANUFACTURING_SELLING);
           holdingSA.addCompanies(eucerin);

            Building eucerinBuilding = new Building (5);           

	     } 
     


	     //Mostramos las opciones del menu
	
	     public void showOptions() {


		System.out.println ("Bienvenido");

	      System.out.println ("Por favor, digite la opcion que desea ver");

	      System.out.println ("1. Para registrar una compañia");

	      System.out.println ("2. Para agregar productos a una compañia de fabricacion");

	      System.out.println ("3. Para calcular el impuesto de procultura a una compañia");

            System.out.println ("4. Para calcular cuantos arboles debe sembrar una compañia segun los recursos que utiliza");

            System.out.println ("5. Para registrar una encuesta");

            System.out.println ("6. Para calcular el porcentaje de satisfaccion de una empresa");

            System.out.println ("7. Para buscar la extension de un empleado por medio de su nombre");

            System.out.println ("8. Para buscar el email de los empleados que se encuentren en un cargo especifico");

            System.out.println ("9. Para mostrar la informacion de las compañias que estan actualmente en el holding");

            System.out.println ("10. Para agregar un empleado a una oficina");

	      System.out.println ("11. Salir");
    
	     }  



	public void showMenu (){
		
	     int userInput = 0;
	  
	     while(userInput != 11){
	
		     showOptions();	
	           userInput = reader.nextInt();
	           reader.nextLine();

	     switch (userInput){

	     	case 1: 

                   System.out.println ("Ingrese el nombre de la compañia");
                   String nameCompany = reader.nextLine();

                   System.out.println ("Ingrese la direccion de correspondencia de la compañia");
                   String correspondanceDirection = reader.nextLine();

                   System.out.println ("Ingrese el numero de telefono de la compañia");
                   int phoneNumber = reader.nextInt();
                   reader.nextLine();

                   System.out.println ("Ingrese el nit de la compañia");
                   String nit = reader.nextLine();

                   System.out.println ("Ingrese la cantidad de empleados que tiene la compañia");
                   int quantityEmployees = reader.nextInt();
                   reader.nextLine();

                   System.out.println ("Ingrese el valor de los activos en pesos de la compañia");
                   double activeValue = reader.nextDouble();
                   reader.nextLine();

                   System.out.println ("Seleccione un numero segun el tipo de compañia");
                   System.out.println ("1. Agricultura, caza, silvicultura y pesca \n" + "2. Explotacion de minas y canteras \n" 
                                     + "3. Industria manufacturera \n" +  "4. Electricidad, gas y vapor \n" 
                                     + "5. Construccion \n" + "6. Comercio al por mayor y al por menor \n"
                                     + "6. Transporte, almacenamiento y comunicaciones \n" + "7. Estados financieros, seguros, inmuebles, servicio a companias \n"
                                     + "8. Comunales y sociales");
                   String type = reader.nextLine();

                   String companyType ="";
                   companyType = holdingSA.showTypeCompanyOptions(type);

                   System.out.println ("Ingrese el nombre del representante legal");
                   String nameLR = reader.nextLine();

                   System.out.println ("Ingrese el dia en el que se creo la empresa");
                   int day = reader.nextInt();
                   reader.nextLine();

                   System.out.println ("Ingrese el mes en el que se creo la empresa");
                   int month = reader.nextInt();
                   reader.nextLine();

                   System.out.println ("Ingrese el año en el que se creo la empresa");
                   int year = reader.nextInt();
                   reader.nextLine();

                   Time dateConstitution = new Time (year, month, day);

                   System.out.println ("Ingrese el numero de pisos que tiene el edificio de la compañia");
                   int numberOfFloors = reader.nextInt();
                   reader.nextLine();

                   System.out.println ("Seleccione un numero segun la clase de compañia");
                   System.out.println ("1. Empresa de fabricacion \n" + "2. Empresa de servicios \n" + 
                                       "3. Empresa de fabricacion de medicamentos \n" + "4. Empresa de tecnologia \n" +
                                       "5. Empresa de educacion \n" + "6. Empresa de servicios publicos \n");
                   String option  = reader.nextLine();

                   if(option.equals("1")){
                        ManufacturingCompany mc = new ManufacturingCompany (nameCompany, nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution);
                        holdingSA.addCompanies(mc);
                        Building building = new Building (numberOfFloors);
                        mc.setBuilding(building);
                   }

                   else if (option.equals("2")){
                        ServiceCompany sc = new ServiceCompany ( nameCompany,  nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution);
                        holdingSA.addCompanies(sc);
                        Building building = new Building (numberOfFloors);
                        sc.setBuilding(building);
                   }

                   else if (option.equals("3")){

                        System.out.println ("Ingrese el registro sanitario");
                        String healthRegister = reader.nextLine();

                        System.out.println ("Ingrese el estado");
                        System.out.println ("1. Vigente \n" + "2. Vencido \n");
                        String statusOption = reader.nextLine();

                        String status = "";

                        if(statusOption.equals("1")){
                              status = MedicineManufacturingCompany.CURRENT;
                        }

                        else if(statusOption.equals("2")){
                              status = MedicineManufacturingCompany.NOT_RENEWED;
                        }

                        System.out.println ("Ingrese el mes de vencimiento");
                        int dueMonth = reader.nextInt();
                        reader.nextLine();


                        System.out.println ("Ingrese el año de vencimiento");
                        int dueYear = reader.nextInt();
                        reader.nextLine();

                        System.out.println ("Ingrese la modalidad");
                        System.out.println ("1. Fabricar y exportar \n" + "2. Fabricar y vender \n" + "3. Importar y vender \n");
                        String modeOption = reader.nextLine();
                        String mode = "";

                        if(modeOption.equals("1")){
                              mode = MedicineManufacturingCompany.MANUFACTURING_EXPORTING;
                        }

                        else if(modeOption.equals("2")){
                              mode = MedicineManufacturingCompany.MANUFACTURING_SELLING;
                        }

                        else if(modeOption.equals("3")){
                              mode = MedicineManufacturingCompany.IMPORT_SELL;
                        }

                        MedicineManufacturingCompany mmc = new MedicineManufacturingCompany ( nameCompany,  nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution,  healthRegister,  status,  dueMonth,  dueYear,  mode);
                        holdingSA.addCompanies(mmc);
                        Building building = new Building (numberOfFloors);
                        mmc.setBuilding(building);
                   }

                   else if(option.equals("4")){

                        System.out.println ("Ingrese el tipo de servicio");
                        System.out.println ("1. Consultoria \n" + "2. Entrenamiento \n" + "3. Desarrollo de software \n" +
                                            "4. Infraestructura \n" + "5. Servicio de software \n" + "6. Plataforma \n");
                        String optionService = reader.nextLine();

                        String service = "";

                        if(optionService.equals("1")){
                              service = TecnologyCompany.CONSULTING;
                        }

                        else if(optionService.equals("2")){
                              service = TecnologyCompany.TRAINING;
                        }

                        else if(optionService.equals("3")){
                              service = TecnologyCompany.SOFTWARE_DEVELOPMENT;
                        }

                        else if(optionService.equals("4")){
                              service = TecnologyCompany.INFRAESTRUCTURE;
                        }

                        else if(optionService.equals("5")){
                              service = TecnologyCompany.SOFTWARE_SERVICE;
                        }

                        else if(optionService.equals("6")){
                              service = TecnologyCompany.PLATFORM;
                        }

                        System.out.println ("Ingrese la cantidad de energia que utiliza la empresa");
                        double energy = reader.nextDouble();
                        reader.nextLine();

                        TecnologyCompany tc = new TecnologyCompany ( nameCompany,  nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution,  service,  energy);
                        holdingSA.addCompanies(tc);
                        Building building = new Building (numberOfFloors);
                        tc.setBuilding(building);

                   }

                   else if(option.equals("5")){

                        System.out.println ("Ingrese el registro de aprobacion del ministerio de educacion");
                        String aprobationRegisterMEN = reader.nextLine();

                        System.out.println ("Ingrese los años que la compañia ha estado acreditada");
                        int yearsAccreditation = reader.nextInt();
                        reader.nextLine();

                        System.out.println ("Ingrese la posicion del ICFES");
                        int positionICFES = reader.nextInt();
                        reader.nextLine();

                        System.out.println ("Ingrese el nombre del director de la compañia");
                        String leadershipName = reader.nextLine();

                        System.out.println ("Seleccione el sector educativo");
                        System.out.println ("1. Universitario \n" + "2. Bachillerato");
                        String optionEducationSector = reader.nextLine();

                        String educationSector ="";

                        if(optionEducationSector.equals("1")){
                              educationSector = EducationCompany.UNIVERSITY;
                        }

                        else if(optionEducationSector.equals("2")){
                              educationSector = EducationCompany.HIGH_SCHOOL;
                        }

                        System.out.println ("Ingrese los estudiantes activos de estrato 1 y 2");
                        int activeStudents1and2 = reader.nextInt();
                        reader.nextLine();

                        System.out.println ("Ingrese el total de estudiantes activos");
                        int totalActiveStudents = reader.nextInt();
                        reader.nextLine();

                        EducationCompany ec = new EducationCompany ( nameCompany,  nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution,
                                  aprobationRegisterMEN,  yearsAccreditation,  positionICFES,  leadershipName,  educationSector,  activeStudents1and2,  totalActiveStudents);

                        holdingSA.addCompanies(ec);
                        Building building = new Building (numberOfFloors);
                        ec.setBuilding(building);
                  }

                  else if(option.equals("6")){

                        System.out.println ("Seleccione el tipo de servicio");
                        System.out.println ("1. Alcantarillado \n" + "2. Energia \n" + "3. Acueducto \n");
                        String typeService = reader.nextLine();

                        System.out.println ("Ingrese el numero total de suscriptores");
                        int totalNumberOfSuscribers = reader.nextInt();
                        reader.nextLine();

                        System.out.println ("Ingrese la cantidad de suscriptores de estrato 1 y 2");
                        int suscribers1and2 = reader.nextInt();
                        reader.nextLine();

                        PublicServiceCompany psc = new PublicServiceCompany ( nameCompany,  nit,  correspondanceDirection,  phoneNumber,  quantityEmployees,  activeValue,  companyType,  nameLR,  dateConstitution,
                                      typeService,  totalNumberOfSuscribers,  suscribers1and2);
                        holdingSA.addCompanies(psc);
                        Building building = new Building (numberOfFloors);
                        psc.setBuilding(building);
                  }


	     	 break;

             case 2:

                  System.out.println("Seleccione a cual de las siguientes compañias desea agregarle el producto. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  String nameOfCompany = reader.nextLine();

                  System.out.println("Escriba el nombre del producto");
                  String nameProduct = reader.nextLine();
                  
                  System.out.println("Escriba el codigo del producto");
                  String codeProduct = reader.nextLine();

                  System.out.println("Ingrese la cantidad de agua que necesita el producto");
                  double water = reader.nextDouble();
                  reader.nextLine();

                  System.out.println("Ingrese el numero de unidades del producto");
                  int unitsInventory = reader.nextInt();

                  holdingSA.addProductsToACompany(nameOfCompany, nameProduct, codeProduct, water, unitsInventory);
            
            break;

            case 3:

                  System.out.println("Seleccione a cual de las siguientes compañias desea calcularle el impuesto procultura. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();
                  holdingSA.calculateProcultureTax(nameOfCompany);
            break;

            case 4:

                  System.out.println("Seleccione a cual de las siguientes compañias desea calcularle el servicio recurso natural por arbol. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();
                  holdingSA.calculateNaturalResource(nameOfCompany);
            

            case 5:

                  System.out.println("Seleccione a cual de las siguientes compañias desea registrarle la encuesta. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();

                  System.out.println("1.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique el servicio prestado");
                  int answer1 = reader.nextInt();
                  reader.nextLine();

                  System.out.println("2.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique el tiempo de respuesta dado");
                  int answer2 = reader.nextInt();
                  reader.nextLine();

                  System.out.println("3.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique la relacion costo/beneficio del servicio adquirido");
                  int answer3 = reader.nextInt();
                  reader.nextLine();

                  holdingSA.realizeAPoll(nameOfCompany, answer1, answer2, answer3);

            break;

            case 6:

                  System.out.println("Seleccione a cual de las siguientes compañias desea registrarle la encuesta. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();
                  holdingSA.calculateSatisfactionServiceCompany(nameOfCompany);
            break;

            case 7:

                  System.out.println("Seleccione a cual de las siguientes compañias desea buscar la extension del empleado. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();

                  System.out.println("Ingrese el nombre del empleado");
                  String nameEmployeed = reader.nextLine();

                  System.out.println("Seleccione el tipo de busqueda");
                  System.out.println("1. En forma de Z \n" + "2. En forma de X \n" + "3. En forma de O \n" + "4. En forma de E \n");
                  String optionModality = reader.nextLine();

                  if (optionModality.equals("1")){

                        System.out.println(holdingSA.haulExtensionZ(nameEmployeed));
                  }

                  else if(optionModality.equals("2")){

                        System.out.println(holdingSA.haulExtensionX(nameEmployeed));
                  }

                  else if(optionModality.equals("3")){

                        System.out.println(holdingSA.haulExtensionO(nameEmployeed));
                  }

                  else if(optionModality.equals("4")){

                        System.out.println(holdingSA.haulExtensionE(nameEmployeed));
                  }

            break;

            case 8:

                  System.out.println("Seleccione a cual de las siguientes compañias desea buscar la extension del empleado. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();

                  System.out.println("Ingrese el cargo del empleado");
                  String chargeEmployeed = reader.nextLine();

                  System.out.println(holdingSA.haulEmail(chargeEmployeed));
            break;

            case 9:

                  System.out.println(holdingSA.showInformationCompanies());
            break;

            case 10:

                  System.out.println("Seleccione a cual de las siguientes compañias desea aregarle un empleado. Escriba el nombre");
                  System.out.println(holdingSA.showActualCompanies());
                  nameOfCompany = reader.nextLine();

                  System.out.println("Ingrese el nombre del empleado");
                  String name=reader.nextLine();

                  System.out.println("Ingrese el cargo del empleado");
                  String carge=reader.nextLine();

                  System.out.println("Ingrese el correo del empleado");
                  String email=reader.nextLine();

                  holdingSA.addEmployeToACubicle(nameOfCompany,name, carge, email);
            break;

}}}}
