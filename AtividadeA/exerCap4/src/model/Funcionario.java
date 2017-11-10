package model;

public class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	public Data dataDeEntradaNoBanco = new Data(); //quando chamarem new funcionario terá uma new data pr
	public String rg;
	
	public void recebeAumento(double aumento) {
		salario += aumento;
	}
	
	public double calculaGanhoAnual(){
		double ganhoAnual = salario * 12;
		return ganhoAnual;
	}
	
	public void mostra(){
		System.out.println("Nome do funcionario: " + this.nome + "\nDepartamento: " + this.departamento + "\nSalario: " + this.salario + "\nRG: " + this.rg);
		this.dataDeEntradaNoBanco.formatada();
	}
	
}