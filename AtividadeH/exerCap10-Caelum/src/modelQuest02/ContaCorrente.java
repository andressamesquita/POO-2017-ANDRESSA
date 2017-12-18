package modelQuest02;


public class ContaCorrente extends Conta implements Tributavel {
	
	@Override
	public void atualiza(double taxa){
		this.deposita(getSaldo() * taxa * 2);
	}
	
	public void deposita(double valor){
		super.deposita(valor - 0.10);
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
