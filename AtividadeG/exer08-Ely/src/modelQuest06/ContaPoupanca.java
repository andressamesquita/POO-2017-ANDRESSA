package modelQuest06;

public class ContaPoupanca extends Conta {

	//3) PROBLEMA: A classe ContaPoupança, por herdar de Conta, será obrigada a reescrever este método, tornando-o “concreto”.
	
	//CORRIGINDO:
	@Override
	public void atualiza(double taxa) {
		 this.deposita(getSaldo() * taxa * 3);
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	
	
}
