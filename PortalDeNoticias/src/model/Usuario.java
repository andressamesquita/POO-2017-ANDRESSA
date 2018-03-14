package model;

public class Usuario extends Pessoa {
	
	private String nome;
	
	public Usuario(String n, String e, String s){
		super(e,s);
		this.setNome(n);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
