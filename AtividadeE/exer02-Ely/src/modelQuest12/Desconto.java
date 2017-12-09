package modelQuest12;

public class Desconto {
	
	public double valorOriginal;
	public double desconto;
	
	public double calcular(){
		return valorOriginal * (1 - desconto / 100);
	}

}
