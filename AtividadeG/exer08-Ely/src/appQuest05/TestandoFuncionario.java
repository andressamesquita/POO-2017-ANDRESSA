package appQuest05;
import modelQuest05.*;

public class TestandoFuncionario {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente(1200.00, 1.2);
		
		System.out.println("Bonificação Gerente = R$ " + gerente.getBonificação() );
		System.out.println("Bonificação aplicada ao rendimento = R$ " + gerente.getSalario());
		
		Funcionario diretor = new Diretor(880.00);
		
		System.out.println("\nBonificação = R$ " + diretor.getBonificação() );
		System.out.println("Bonificação aplicada ao rendimento = R$ " + diretor.getSalario());

		
	}

}
