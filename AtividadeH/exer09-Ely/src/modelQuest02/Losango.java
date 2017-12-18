package modelQuest02;

public class Losango implements FiguraGeometrica, Comparavel{
	
	private int diagonalMaior;
	private int diagonalMenor;
	private int l1, l2;
	
	public Losango(int D, int d, int l1, int l2){
		this.diagonalMaior = D;
		this.diagonalMenor = d;
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public int calcularArea() {
		return (this.diagonalMaior * this.diagonalMenor)/2;
	}

	public int perimetro() {
		return (this.l1 * 2) + (this.l2 * 2);
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
