package model;

public class ContaPoupanca extends Conta {

	//3) PROBLEMA: A classe ContaPoupança, por herdar de Conta, será obrigada a reescrever este método, tornando-o “concreto”.
	
	//CORRIGINDO:
	@Override
	public void atualiza(double taxa) {
		 this.deposita(getSaldo() * taxa * 3);
	}
	
}
