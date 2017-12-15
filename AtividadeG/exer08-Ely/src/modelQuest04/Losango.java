package modelQuest04;

public class Losango extends FiguraGeometrica{
	
	private int diagonalMaior;
	private int diagonalMenor;
	private int l1, l2;
	
	public Losango(int D, int d, int l1, int l2){
		this.diagonalMaior = D;
		this.diagonalMenor = d;
		this.l1 = l1;
		this.l2 = l2;
		
	}

	@Override
	public int calcularArea() {
		return (diagonalMaior * diagonalMenor)/2;
	}

	@Override
	public int perimetro() {
		return (l1 * 2) + (l2 * 2);
	}
	
}
