package modelQuest09;

public class SituacaoFinanceira {
	
	public double valorCredito;
	public double valorDebito;
	
	public double saldo(){
		return valorCredito - valorDebito;
	}
	
}
