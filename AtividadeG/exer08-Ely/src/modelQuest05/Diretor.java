package modelQuest05;

public class Diretor extends Funcionario{

	private double salario;
	
	public Diretor(double salario){
		
		this.salario = salario;
		
	}
		
	@Override
	public double getBonificação() {
		return this.salario * 1.2;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}


}
