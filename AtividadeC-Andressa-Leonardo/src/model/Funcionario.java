package model;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntradaNoBanco; //quando chamarem new funcionario terá uma new data pr
	private String cpf;
	
	public Funcionario(String cpf) {
		setCpf(cpf);
	}
	
	
	public void recebeAumento(double aumento) {
		setSalario(getSalario() + aumento);
	}
	
	public double calculaGanhoAnual(){
		double ganhoAnual = getSalario() * 12;
		return ganhoAnual;
	}
	
	public void mostra(){
		System.out.println("Nome do funcionario: " + this.getNome() + "\nDepartamento: " + this.getDepartamento() + "\nSalario: " + this.getSalario() + "\nRG: " + this.getCpf());
		this.getDataDeEntradaNoBanco().formatada();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = valida(cpf);
	}
	public String valida(String cpf){
		return cpf;
	}

	public Data getDataDeEntradaNoBanco() {
		return dataDeEntradaNoBanco;
	}

	public void setDataDeEntradaNoBanco(Data dataDeEntradaNoBanco) {
		this.dataDeEntradaNoBanco = dataDeEntradaNoBanco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}