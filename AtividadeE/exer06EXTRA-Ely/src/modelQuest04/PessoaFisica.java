package modelQuest04;

public class PessoaFisica {
	private String cpf;
	
	public PessoaFisica(String cpf){
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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
