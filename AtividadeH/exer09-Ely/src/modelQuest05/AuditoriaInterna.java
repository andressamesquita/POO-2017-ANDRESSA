package modelQuest05;
import modelQuest04.*;

public class AuditoriaInterna{
	
	Tributavel[] tributaveis = new Tributavel[5];
	
	private int c;
	private double soma;
	
	public void adicionar(Tributavel tributavel){
		tributaveis[c] = tributavel;
		c++;
	}
	
	public double calcularTributos(){
		
		for(int i = 0; i < c; i++){
			soma += tributaveis[i].calculaTributos();
		}
		return soma;
	}
}	