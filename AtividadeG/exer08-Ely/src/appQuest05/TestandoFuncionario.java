package appQuest05;
import modelQuest05.*;

public class TestandoFuncionario {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente(1200.00, 1.2);
		
		System.out.println("Bonifica��o Gerente = R$ " + gerente.getBonifica��o() );
		System.out.println("Bonifica��o aplicada ao rendimento = R$ " + gerente.getSalario());
		
		Funcionario diretor = new Diretor(880.00);
		
		System.out.println("\nBonifica��o = R$ " + diretor.getBonifica��o() );
		System.out.println("Bonifica��o aplicada ao rendimento = R$ " + diretor.getSalario());

		
	}

}
