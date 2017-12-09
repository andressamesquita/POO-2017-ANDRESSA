package modelQuest07;
import modelQuest06.*;

public class Funcionario extends Pessoa {
	
	private int matricula;
	protected double salario;
	
	public Funcionario(String nome, String sobrenome, int matricula, double salario){
		super(nome,sobrenome);
		this.matricula = matricula;
		this.setSalario(salario);
	}
	
	public double setSalarioPrimeiraParcela(){
		return getSalario() * 0.6;
	}
	
	public double getSalarioSegundaParcela(){
		return getSalario() * 0.4;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

