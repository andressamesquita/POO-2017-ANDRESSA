package modelQuest04;

public class Quadrado extends FiguraGeometrica {

	private int base;
	private int altura;
	
	public Quadrado (int base, int altura){
			
		this.base = base;
		this.altura = altura;
		
	}
	
	@Override
	public int calcularArea() {
		return base * altura;
	}

	@Override
	public int perimetro() {
		return (2 * base) + (2 * altura);
	}

}
