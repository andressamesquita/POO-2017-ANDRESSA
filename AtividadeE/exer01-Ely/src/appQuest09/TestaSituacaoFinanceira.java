package appQuest09;
import modelQuest09.*;

public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		
		SituacaoFinanceira situacao = new SituacaoFinanceira();
		
		situacao.valorCredito = 1500;
		situacao.valorDebito = 500;
		
		System.out.println("Seu saldo eh " + situacao.saldo());
	}

}
