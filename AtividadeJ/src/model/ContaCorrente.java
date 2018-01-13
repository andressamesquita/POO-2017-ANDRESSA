package model;
import exceptions.SaldoInsuficienteException;


public class ContaCorrente implements ContaTributavel {
	
	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	public void atualiza(double taxa){
		this.deposita(this.saldo * taxa * 2);
	}
	
	public void deposita(double valor){
		
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
		}else{
			this.saldo += (valor - 0.10);
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor){
		
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou sacar um valor negativo.");
		}
		
		if(this.saldo < valor){
			throw new SaldoInsuficienteException(valor);
		}
		
		this.saldo -= (valor + 0.10);		
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
}
