package modelQuest03;

public class Bovino extends Animal {
	
	private float producaoLeite;

	
	public Bovino(String especie, float prod){
		super(especie);
		this.producaoLeite = prod;
	}
	
	public void setProduacaoDeLeite(int producao) {
		this.producaoLeite = producao;
	}
	
	public float getProducaoLeite() {
		return producaoLeite;
	}
		

}
