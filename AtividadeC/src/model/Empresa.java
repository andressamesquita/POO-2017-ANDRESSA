package model;

public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int quantMaxFuncionario;
	private int quantFuncionario = 0;
	
	public Empresa(String nome,String cnpj, int q){
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setQuantMaxFuncionario(q);
		setEmpregados(new Funcionario[10]);
		
	}
	
	public void adiciona(Funcionario f){
		this.getEmpregados()[getQuantFuncionario()] = f;
		setQuantFuncionario(getQuantFuncionario() + 1);
		
		
	}
	public void mostraEmpregados() {
		for (int i = 0; i < this.getEmpregados().length; i++) {
			getEmpregados()[i].mostra();
		}
	
	}
	public boolean contem(Funcionario f){
		for (int i = 0; i < this.getEmpregados().length; i++) {
			if(getEmpregados()[i].equals(f)){
				return true;
			}
		}
		return false;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getCnpj() {
		return cnpj;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	Funcionario[] getEmpregados() {
		return empregados;
	}

	void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	int getQuantFuncionario() {
		return quantFuncionario;
	}

	void setQuantFuncionario(int quantFuncionario) {
		this.quantFuncionario = quantFuncionario;
	}

	int getQuantMaxFuncionario() {
		return quantMaxFuncionario;
	}

	void setQuantMaxFuncionario(int quantMaxFuncionario) {
		this.quantMaxFuncionario = quantMaxFuncionario;
	}
	
	
	
}
