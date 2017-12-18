package modelQuest03;

public class ContaCorrente implements ContaTributavel {
	
	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	public void atualiza(double taxa){
		this.deposita(this.saldo * taxa * 2);
	}
	
	public void deposita(double valor){
		this.deposita(valor - 0.10);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;		
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
}
