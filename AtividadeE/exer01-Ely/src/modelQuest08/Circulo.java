package modelQuest08;

public class Circulo {
	
	public int raio;
	
	public double calcularArea(){
		return (3.14 * (raio ^ 2));
	}
	
	public double calcularPerimetro(){
		return (raio + raio)*3.14;
	}

}
