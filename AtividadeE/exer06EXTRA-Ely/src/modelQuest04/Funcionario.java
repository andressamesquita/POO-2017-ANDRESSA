package modelQuest04;

public class Funcionario {

	private String cpf;
	
	public Funcionario(String cpf){
		this.cpf = cpf;
	}

	public boolean isCPFvalido(){
		
		boolean retorno;
		
		if (cpf == "00000000000"){
			retorno = false;
		}else{
			retorno = true;
		}
		return retorno;
	}
	
}
