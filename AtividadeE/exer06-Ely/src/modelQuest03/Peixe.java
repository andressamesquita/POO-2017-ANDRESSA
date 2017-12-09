package modelQuest03;

public class Peixe extends Animal{
	
	private int profundidade;
	
	public Peixe(String especie, int profundidade){
		super(especie);
		this.profundidade = profundidade;
	}
	
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
		
	

}
