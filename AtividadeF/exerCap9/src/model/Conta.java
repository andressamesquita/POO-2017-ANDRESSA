package model;

public abstract class Conta { // 1) � ideal para ser abstrata por ser uma classe que apenas idealiza um tipo, define apenas um rascunho.
	
	protected double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public abstract void atualiza(double taxa);
	
}
