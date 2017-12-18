package modelQuest04;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nome, double saldo) {
		super(nome, saldo);
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.1;
	}
	

}
