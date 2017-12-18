package modelQuest01;

public class Quadrado implements FiguraGeometrica {

	private int base;
	private int altura;
	
	public Quadrado (int base, int altura){
			
		this.base = base;
		this.altura = altura;
		
	}
	
	
	public int calcularArea() {
		return base * altura;
	}

	
	public int perimetro() {
		return (2 * base) + (2 * altura);
	}

}
