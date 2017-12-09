package modelQuest01; 

public class Horista extends Diarista {
		
	public Horista(double salario){
		super(salario);
	}
	
	public double calcSalario(){
		return super.getSalario()/24;
	}
	
}
