package model;

public class Poll{

	//Atributos

	private String question1;
	private String question2;
	private String question3;
	private int answer1;
	private int answer2;
	private int answer3;

	//Constructor

	public Poll(int answer1,int answer2, int answer3) {

		this.question1 = "1.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique el servicio prestado";
		this.question2 = "2.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique el tiempo de respuesta dado";
		this.question3 = "3.En una escala del 1 al 5, siendo 1 no satisfecho y 5 muy satisfecho califique la relacion costo/beneficio del servicio adquirido";
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}

	//Metodos


	/**
    * This method return the question one <br>

    * <b>pre:</b> question1 is initilized, question1 != null <br>

    * <b>post:</b> question1 was returned <br>

    * @return String The method returns question one<br>
    */

	public String getQuestion1() {
		return question1;
	}


	/**
    * This method set the question one <br>

    * <b>pre:</b> question1 is initilized, question1 != null <br>

    * <b>post:</b> question1 was changed <br>

    * @param question1 Is the new question1<br>
    */

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}


	/**
    * This method return the question two <br>

    * <b>pre:</b> question2 is initilized, question2 != null <br>

    * <b>post:</b> question2 was returned <br>

    * @return String The method returns question two<br>
    */

	public String getQuestion2() {
		return question2;
	}


	/**
    * This method set the question two <br>

    * <b>pre:</b> question2 is initilized, question2 != null <br>

    * <b>post:</b> question2 was changed <br>

    * @param question2 Is the new question<br>
    */

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	/**
    * This method return the question three <br>

    * <b>pre:</b> question3 is initilized, question3 != null <br>

    * <b>post:</b> question3 was returned <br>

    * @return String The method returns question three<br>
    */

	public String getQuestion3() {
		return question3;
	}


	/**
    * This method set the question three <br>

    * <b>pre:</b> question3 is initilized, question3 != null <br>

    * <b>post:</b> question3 was changed <br>

    * @param question3 Is the new question three<br>
    */

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}


	/**
    * This method return the answer one <br>

    * <b>pre:</b> answer1 is initilized, answer1 != null <br>

    * <b>post:</b> answer1 was returned <br>

    * @return String The method returns answer one<br>
    */

	public int getAnswer1() {
		return answer1;
	}


	/**
    * This method set the answer one <br>

    * <b>pre:</b> answer1 is initilized, answer1 != null <br>

    * <b>post:</b> answer1 was changed <br>

    * @param answer1 Is the new answer<br>
    */

	public void setAnswer1(int answer1) {
		this.answer1 = answer1;
	}

	
	/**
    * This method return the answer two <br>

    * <b>pre:</b> answer2 is initilized, answer2 != null <br>

    * <b>post:</b> answer2 was returned <br>

    * @return String The method returns answer two<br>
    */	

	public int getAnswer2() {
		return answer2;
	}

	/**
    * This method set the answer two <br>

    * <b>pre:</b> answer2 is initilized, answer2 != null <br>

    * <b>post:</b> answer2 was changed <br>

    * @param answer2 Is the new answer<br>
    */

	public void setAnswer2(int answer2) {
		this.answer2 = answer2;
	}


	/**
    * This method return the answer three <br>

    * <b>pre:</b> answer3 is initilized, answer3 != null <br>

    * <b>post:</b> answer3 was returned <br>

    * @return String The method returns answer three<br>
    */	

	public int getAnswer3() {
		return answer3;
	}

	/**
    * This method set the answer three <br>

    * <b>pre:</b> answer3 is initilized, answer3 != null <br>

    * <b>post:</b> answer3 was changed <br>

    * @param answer3 Is the new answer<br>
    */

	public void setAnswer3(int answer3) {
		this.answer3 = answer3;
	}
}//Cierra la clase