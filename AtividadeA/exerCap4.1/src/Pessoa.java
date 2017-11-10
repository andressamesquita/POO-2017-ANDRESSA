
public class Pessoa {
	
	String nome;
	int idade;
	
	public void fazAniversario() {
		idade += 1;
		System.out.println("Nome: " + this.nome + "\n" + "Idade: " + this.idade );
	}
	
}
