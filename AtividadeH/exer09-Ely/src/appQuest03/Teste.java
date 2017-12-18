package appQuest03;
import modelQuest02.*;

public class Teste {

	public static void main(String[] args) {
		
		Comparavel quadrado = new Quadrado(5,4);
		FiguraGeometrica quadrado2 = new Quadrado(3,6);
		FiguraGeometrica triangulo = new Triangulo(3,2,12,3,4);
		Comparavel losango = new Losango(10,6,5,2);
		
		System.out.println(quadrado.comparar(quadrado2));		
	
		System.out.println("Perimetro do triangulo: " + triangulo.perimetro());
		
		System.out.println(((Comparavel) triangulo).comparar(quadrado2));
 		
		System.out.println(losango.comparar(quadrado2));
		
		System.out.println("Perimetro do losango: " + ((FiguraGeometrica)losango).perimetro());
		
		System.out.println("Area do quadrado2: " + quadrado2.calcularArea());
		
		System.out.println("Area do losango: " + ((FiguraGeometrica)losango).calcularArea());
	}

}
