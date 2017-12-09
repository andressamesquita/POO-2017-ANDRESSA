package modelQuest02;

public class CalculadoraCientifica extends Calculadora {

	public CalculadoraCientifica(int operando1, int operando2) {
		
		super(operando1, operando2);
				
	}
	
	public double exponenciar(int base, int expoente){
		
		double expo = base^expoente;
		return expo;
	}
	
	public double divisao(){
		
		return super.divisao();
		
	}
}
