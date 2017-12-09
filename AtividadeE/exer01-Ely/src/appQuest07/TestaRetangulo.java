package appQuest07;
import modelQuest07.*;

public class TestaRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		retangulo.l1 = 10;
		retangulo.l2 = 20;
		
		System.out.println("Perimetro: " + retangulo.calcularPerimetro());
		
		
	}

}
