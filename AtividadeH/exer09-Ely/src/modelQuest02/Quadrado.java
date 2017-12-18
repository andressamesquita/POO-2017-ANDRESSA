package modelQuest02;

public class Quadrado implements FiguraGeometrica, Comparavel {

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

	public int comparar(FiguraGeometrica a) {
		
		if (this.calcularArea() < a.calcularArea()){
			return -1;
		
		}else if(this.calcularArea() == a.calcularArea()){
			return 0;
		
		}else{
			return 1;
		}
	}

}
