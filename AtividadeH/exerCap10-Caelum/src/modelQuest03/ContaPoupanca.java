package modelQuest03;

public class ContaPoupanca implements Conta {
	
	private double saldo;
	
	public ContaPoupanca(double saldo){
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
		 this.deposita(this.saldo * taxa * 3);
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
}
