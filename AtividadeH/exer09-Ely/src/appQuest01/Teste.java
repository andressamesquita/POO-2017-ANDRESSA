package appQuest01;
import modelQuest01.*;

public class Teste {

	public static void main(String[] args) {
		
		FiguraGeometrica triangulo = new Triangulo(10,4,10,7,8);
		
		System.out.println("Area do Triangulo: " + triangulo.calcularArea());
		System.out.println("Perimetro do Triangulo: " + triangulo.perimetro());
		
		FiguraGeometrica quadrado = new Quadrado(8,4);
		
		System.out.println("\nArea do Quadrado: " + quadrado.calcularArea());
		System.out.println("Perimetro do Quadrado: " + quadrado.perimetro());
		
		FiguraGeometrica losango = new Losango(7,5,8,4);
		
		System.out.println("\nArea do Losango: "+ losango.calcularArea());
		System.out.println("Perimetro do Losango: "+losango.perimetro());

	}

}
