package modelQuest03;

public class Carro extends Veiculo {
	
	private String modelo;
	
	public Carro(String placa, int ano, String modelo){
		super(placa, ano);
		this.setModelo(modelo);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
