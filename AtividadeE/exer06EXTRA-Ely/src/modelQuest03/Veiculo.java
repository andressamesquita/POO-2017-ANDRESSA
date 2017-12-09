package modelQuest03;

public class Veiculo {
	
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano){
	
		this.setPlaca(placa);
		this.setAno(ano);	
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
