package model;

public class ContaCorrente extends Conta {
	
	// 5) N�o h� outra maneira para ContaCorrente se n�o reescrever o m�todo, uma vez que ela herda de Conta e possue valores diferentes
	//    dos de ContaPoupan�a a serem tratados.
	
	@Override
	public void atualiza(double taxa){
		this.deposita(getSaldo() * taxa * 2);
	}
	
	public void deposita(double valor){
		super.deposita(valor - 0.10);
	}
	
}
