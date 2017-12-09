package modelQuest14;

public class Equipamento {

	public boolean ligado;
	
	public void ligar(){
		ligado = true;
	}
	
	public void desligar(){
		ligado = false;
	}
	
	public void inverte(){
		
		if (ligado){
			ligado = false;
		}else{
			ligado = true;
		}
	}
	
	public boolean estaLigado(){
		return ligado;
	}
}
