package appQuest03;
import modelQuest03.*;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta1 = new ContaCorrente(538);
		Tributavel conta2 = new ContaCorrente(284);
		
		conta1.getSaldo();
		conta2.calculaTributos();
	}

}
