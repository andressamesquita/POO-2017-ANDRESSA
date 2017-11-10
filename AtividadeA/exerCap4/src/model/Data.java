package model;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public void formatada(){
		System.out.println("Data de Admissão: " + this.dia +"/"+this.mes +"/"+ this.ano);
	}
	
}
