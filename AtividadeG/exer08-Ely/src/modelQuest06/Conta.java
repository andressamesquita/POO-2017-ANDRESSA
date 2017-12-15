package modelQuest06;

public abstract class Conta { // 1) é ideal para ser abstrata por ser uma classe que apenas idealiza um tipo, define apenas um rascunho.
	
	protected double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public abstract void saca(double valor);
	
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public abstract void atualiza(double taxa);
	
}
