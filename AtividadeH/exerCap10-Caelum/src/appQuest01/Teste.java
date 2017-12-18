package appQuest01;
import modelQuest01.*;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(">>> AREAS:\n");
		AreaCalculavel retangulo = new Retangulo(3,2);
		System.out.println("Retangulo = " + retangulo.calculaArea());
		
		AreaCalculavel circulo = new Circulo(4);
		System.out.printf("Circulo = %.2f ", circulo.calculaArea());
		
		AreaCalculavel quadrado = new Quadrado(6);
		System.out.println("\nQuadrado = " + quadrado.calculaArea());
		
	}

}
