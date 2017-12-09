package appQuest02;
import modelQuest02.*;

public class TestaAcao {

	public static void main(String[] args) {
		
		Acao a = new Acao(10.0);
		
		System.out.println("Valor: " + a.getValor());
		
		a.setValor(35.9);
		
		System.out.println("Valor atualizado: " + a.getValor() );
		
		
	}

}
