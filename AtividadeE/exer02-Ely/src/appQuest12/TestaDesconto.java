package appQuest12;
import modelQuest12.*;

public class TestaDesconto {

	public static void main(String[] args) {
		
		Desconto descontim = new Desconto();
		
		descontim.valorOriginal = 120;
		descontim.desconto = 10;
		
		System.out.println("Valor calculado: R$ "+ descontim.calcular());
	}

}
