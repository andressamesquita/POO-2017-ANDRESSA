package model;

public class ContaPoupanca extends Conta {

	//3) PROBLEMA: A classe ContaPoupan�a, por herdar de Conta, ser� obrigada a reescrever este m�todo, tornando-o �concreto�.
	
	//CORRIGINDO:
	@Override
	public void atualiza(double taxa) {
		 this.deposita(getSaldo() * taxa * 3);
	}
	
}
