package modelQuest04;

public class ContaImposto {

	private double saldo;
	private int numero;
	private double debito;
	
	public ContaImposto(double saldo,int numero,double debito){
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setRetemImposto(debito); 
		}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getCredito(){
		return saldo;
	}
	
	public double getDebito(int deb){
		setRetemImposto(deb);
		return saldo - deb;
	}
	
	private void setRetemImposto(double valorDebito){
		this.debito = 0.38 * valorDebito;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getDebito() {
		return debito;
	}
	
}
