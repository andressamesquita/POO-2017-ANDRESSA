package appQuest09;
import modelQuest01.*;
import modelQuest02.*;
import modelQuest03.*;
import modelQuest06.*;
import modelQuest07.*;
import modelQuest08.*;

public class TestandoTodasAsQuestoesAnteriorea {

	public static void main(String[] args) {
		
		//PRIMEIRA QUESTAO
		
		Empregado empregado = new Empregado(880);
		
		Diarista diarista = new Diarista(460);
		
		Horista horista = new Horista(480);
				
		System.out.println("Salario do empregado: R$ " + empregado.calcSalario());
		System.out.println("Salario da diarista: R$ " + diarista.calcSalario());
		System.out.println("Salario do horista: R$ "+ horista.calcSalario());
		
		
		//SEGUNDA QUESTAO
		
		
		Calculadora calculadora1 = new Calculadora(25,2);
		
		System.out.println("\nSoma: " + calculadora1.somar());
		System.out.println("Multiplicacao: " + calculadora1.multiplicar());
		System.out.println("Divisao: " + calculadora1.divisao());
		
		
		//TERCEIRA QUESTAO
		
		
		Animal cachorro = new Animal("caninus");
		
		Bovino vaca = new Bovino ("bovinuus", 5);
		
		Peixe nemo = new Peixe ("Neeemo", 5);
		
		
		String especie = cachorro.getEspecie();
		float producao = vaca.getProducaoLeite();
		int profund = nemo.getProfundidade();
		
		System.out.println("\nA especie do cachorro eh "+ especie + ".\nNemo chega a profundidade de "+ profund + " metros.\nE a producao da vaca eh " + producao + " litros.");
		
		
		//SEXTA QUESTAO
				
		
		Pessoa pessoa1 = new Pessoa("Anndreza","Mesquyta");
		
		System.out.println("\nMeu nome eh " + pessoa1.getNomeCompleto() + ".");
		
		pessoa1.setAlterarNomeCompleto("Andressa","Mesquita");
		
		System.out.println("Veiish, errei tudo! Vou corrigir. Se escreve assim: " + pessoa1.getNomeCompleto() + ".");
		
		pessoa1.setAlterarSobrenome("Ribeiro");
		
		System.out.println("Opa, errei meu sobrenome! O certo eh " + pessoa1.getNomeCompleto() + ". Me desculpe.");
		
		
		//SETIMA QUESTAO
		
		
		Funcionario funcionario1 = new Funcionario("Bruno","Franchesco", 490, 880.00);
		
		double primeiraParcela = funcionario1.setSalarioPrimeiraParcela();
		double segParcela = funcionario1.getSalarioSegundaParcela();
		
		System.out.println("\nO salario do funcionario " + funcionario1.getNome() + " eh R$ " + funcionario1.getSalario() + ".\nSua primeira parcela eh de R$ " + primeiraParcela + ".\nE sua segunda eh R$ " + segParcela );
		
		
		//OITAVA QUESTAO
		
		
		Professor professor1 = new Professor("Rogerio", "Silva", 111, 15000,"Mestre");
		
		
		System.out.println("\nNome do professor: " + professor1.getNomeCompleto() + ".\nTitulacao: "+ professor1.titulacao() +".\nMatricula: "+ professor1.getMatricula() + ".\nSalario: R$ " + professor1.setSalarioPrimeiraParcela());
			

	}

}
