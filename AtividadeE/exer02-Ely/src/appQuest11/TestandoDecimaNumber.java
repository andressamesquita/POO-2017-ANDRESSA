package appQuest11;
import modelQuest11.*;

public class TestandoDecimaNumber {

	public static void main(String[] args) {
		
		DecimaNumber numero = new DecimaNumber();
		
		numero.valor = 42.25;
		
		System.out.println("Parte inteira: " + numero.exibirParteInteira());
		System.out.println("Parte Decimal: " + numero.exibirParteDecimal() );
		
	}

}
