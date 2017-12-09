package modelQuest05;

public class A {
	
	private String nome;
	private int anoNascimento;
	
	public A(String nome, int anoNascimento){
		this.setNome(nome);
		this.setAnoNascimento(anoNascimento);
	}

	public int metodo1(int anoAtual){
		return anoAtual - anoNascimento;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int metodo1() {
		
		return 0;
	}
	
}
