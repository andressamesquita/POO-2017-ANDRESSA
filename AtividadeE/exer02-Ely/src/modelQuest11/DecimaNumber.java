package modelQuest11;

public class DecimaNumber {
	
	public double valor;
	
	public double exibirParteInteira(){
		return (int) valor / 1 ;
	}
	
	public double exibirParteDecimal(){
		return valor % 1;
	}
	
}
