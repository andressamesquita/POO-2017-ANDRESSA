package appQuest02;
import modelQuest02.*;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguro = new SeguroDeVida();
		gerenciador.adiciona(seguro);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		gerenciador.adiciona(cc);
		System.out.printf("O total é R$ %.2f.",gerenciador.getTotal());
		
		System.out.printf("\nO saldo é R$ %.2f.",cc.getSaldo());
			

	}

}
