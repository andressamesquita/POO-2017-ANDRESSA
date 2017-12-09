package modelQuest08;
import modelQuest07.*;

public class Professor extends Funcionario {
	
	private String titulacao;
	
	public Professor(String nome, String sobrenome, int matricula, double salario, String titulacao){
		super(nome,sobrenome,matricula,salario);
		this.titulacao = titulacao;
	}
	
	public String titulacao(){
		return titulacao;
	}
	
	@Override
	public double setSalarioPrimeiraParcela(){
		return salario;
	}
	
	@Override
	public double getSalarioSegundaParcela(){
		return 0;
	}
	
}
