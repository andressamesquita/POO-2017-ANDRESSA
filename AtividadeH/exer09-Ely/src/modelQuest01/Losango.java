package modelQuest01;


public class Losango implements FiguraGeometrica{
	
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
	
}
