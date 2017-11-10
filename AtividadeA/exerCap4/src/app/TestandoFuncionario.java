package app;

import model.Funcionario;


public class TestandoFuncionario {
	public static void main(String[] args){
		
		Funcionario f1 = new Funcionario();
				
		f1.nome = "Andressa";
		f1.salario = 1100;
		f1.dataDeEntradaNoBanco.dia = 14;
		f1.dataDeEntradaNoBanco.mes = 4;
		f1.dataDeEntradaNoBanco.ano = 2017;
		f1.departamento = "Finanças";
		f1.rg = "123.123.123";
		
		f1.recebeAumento(250);
		
		double ganhoAnual = f1.calculaGanhoAnual();
		System.out.println("Ganho anual " + f1.nome + ": " + ganhoAnual + "\n");	
		
		f1.mostra();
		
//		Funcionario f2 = f1; mesmo endereco, portanto iguais.
		
		Funcionario f2 = new Funcionario();
		
		f2.nome = "Hugo";
		f2.salario = 1000;
		f2.dataDeEntradaNoBanco.dia = 16;
		f2.dataDeEntradaNoBanco.mes = 9;
		f2.dataDeEntradaNoBanco.ano = 2022;
		f2.departamento = "Documentação";
		f2.rg = "000.000.000";
		
		if (f1 == f2){
			System.out.println("\nSão iguais\n");
		} else {
			System.out.println("\nSão diferentes\n");
		}
		
		f2.mostra();
		
		
	}
	
}
