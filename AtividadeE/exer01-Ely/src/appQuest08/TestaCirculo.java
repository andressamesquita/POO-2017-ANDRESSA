package appQuest08;
import modelQuest08.*;

public class TestaCirculo {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		
		circulo.raio = 5;
		
		System.out.println("Area do Circulo: " + circulo.calcularArea());
		System.out.println("Perimetro do Circulo: " + circulo.calcularPerimetro());

	}

}
