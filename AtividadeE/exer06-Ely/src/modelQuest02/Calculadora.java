package modelQuest02;

public class Calculadora {
	
	protected int operando1;
	protected int operando2;
	
	public Calculadora(int operando1, int operando2){
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public int somar(){
	
		return operando1 + operando2;	
	}
	
	public int multiplicar(){
		
		return operando1 * operando2;
	}
	
	public double divisao(){
		
		return operando1 / operando2;
	}
	
}
