package modelQuest06;

public class Conta {
	
	String numero;
	double valor;
	
	public Conta(String numero, double valor){
		this.numero = numero;
		this.valor = valor;
	}
	
	public void sacar(double quantia){
		this.valor = valor - quantia;
	}
	
	public void tranferir(Conta x ,double v){
		this.valor = valor + v;
	}
	
	public double saldo(){
		return valor;
	}
	
}
