package appQuest06;
import modelQuest05.*;
import modelQuest04.*;

public class Teste {

	public static void main(String[] args) {
		
		AuditoriaInterna auditoria = new AuditoriaInterna();
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		ContaCorrente conta = new ContaCorrente("Edilson",1000);

		
		auditoria.adicionar(conta);
		auditoria.adicionar(seguro);
		
		System.out.println("Total = R$ " + auditoria.calcularTributos());
		

	}

}
