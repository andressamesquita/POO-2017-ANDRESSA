package model;

public class ContaCorrente extends Conta {
	
	// 5) Não há outra maneira para ContaCorrente se não reescrever o método, uma vez que ela herda de Conta e possue valores diferentes
	//    dos de ContaPoupança a serem tratados.
	
	@Override
	public void atualiza(double taxa){
		this.deposita(getSaldo() * taxa * 2);
	}
	
	public void deposita(double valor){
		super.deposita(valor - 0.10);
	}
	
}
