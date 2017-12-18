package modelQuest01;

public class Triangulo implements FiguraGeometrica{
	
	private int base;
	private int altura;
	private int L1; int L2; int L3;
	
	public Triangulo(int base, int altura,int L1, int L2, int L3){
		
		this.base = base;
		this.altura = altura;
		this.L1 = L1;
		this.L2 = L2;
		this.L3 = L3;
		
	}

	public int calcularArea() {
		return base * altura;
	}

	public int perimetro () {
		return L1 + L2 + L3;
	}
	

}
