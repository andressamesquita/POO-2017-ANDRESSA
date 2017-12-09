package modelQuest01;

public class Diarista extends Empregado {
	
	public Diarista(double salario) {
		super(salario);
	}

	public double calcSalario(){
		return super.getSalario()/30;
	}

}
