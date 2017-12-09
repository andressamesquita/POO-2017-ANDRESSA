package appQuest04;
import modelQuest04.PessoaFisica;

public class TestaFuncionario {

	public static void main(String[] args) {
		PessoaFisica f = new PessoaFisica("072340000000");
		
		boolean validade = f.isCPFvalido();	
		
		System.out.println("Validade: " + validade);
	}

}
