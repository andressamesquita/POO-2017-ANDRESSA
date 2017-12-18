package modelQuest02;
import modelQuest02.Conta;


public class AtualizadorDeContas extends Conta {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
	
		this.selic = selic;
	}
	
	public void roda(Conta c){
		
		System.out.println("Saldo anterior: " + c.getSaldo());
		
		c.atualiza(selic);
		
		this.saldoTotal += this.saldoTotal + c.getSaldo();
		
		System.out.println("Saldo final: " + c.getSaldo());
		
	}
	
	public double getSaldoTotal(){
		return saldoTotal;
	}

	@Override
	public void atualiza(double taxa) {
		this.deposita(getSaldo() * taxa);
		
	}

	
}
