package modelQuest05;

public class Gerente extends Funcionario{
	
	private double percent;
	private double salario;
	
	public Gerente(double salario, double p){
		this.percent = p;
		this.salario = salario;
		
	}

	@Override
	public double getBonificação() {
		return this.salario * percent ;
	}

	@Override
	public double getSalario() {
		return this.salario + getBonificação();
	}
	
	

}
