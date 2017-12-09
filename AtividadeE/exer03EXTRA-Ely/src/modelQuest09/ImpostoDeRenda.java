package modelQuest09;

public class ImpostoDeRenda {
	
	double rendaBruta;
	double imposto;
	
	public ImpostoDeRenda(double renda){
		
		this.rendaBruta = renda;
	}
	
	public double calcularImposto(){
				
		if (this.rendaBruta <= 1000) {
			imposto = rendaBruta * 0.05;
		}else{
			imposto = rendaBruta * 0.10;
		}
		return imposto;
	}
	
	public double calcularRendaLiquida(){
		return this.rendaBruta - imposto;
	}
	
}
