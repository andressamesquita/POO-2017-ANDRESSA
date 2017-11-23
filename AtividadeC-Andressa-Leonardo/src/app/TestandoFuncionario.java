package app;

import model.Funcionario;


public class TestandoFuncionario {
	public static void main(String[] args){
		
		Funcionario f1 = new Funcionario("12423414");
				
		f1.setNome("Andressa");
		f1.setSalario(1100);
		f1.getDataDeEntradaNoBanco().setDia(14);
		f1.getDataDeEntradaNoBanco().setMes(4);
		f1.getDataDeEntradaNoBanco().setAno(2017);
		f1.setDepartamento("Finanças");
		f1.setCpf("123.123.123");
		
		f1.recebeAumento(250);
		
		double ganhoAnual = f1.calculaGanhoAnual();
		System.out.println("Ganho anual " + f1.getNome() + ": " + ganhoAnual + "\n");	
		
		f1.mostra();
		
//		Funcionario f2 = f1; mesmo endereco, portanto iguais.
		
		Funcionario f2 = new Funcionario("12343214");
		
		f2.setNome("Hugo");
		f2.setSalario(1000);
		f2.getDataDeEntradaNoBanco().setDia(16);
		f2.getDataDeEntradaNoBanco().setMes(9);
		f2.getDataDeEntradaNoBanco().setAno(2022);
		f2.setDepartamento("Documentação");
		f2.setCpf("000.000.000");
		
		if (f1 == f2){
			System.out.println("\nSão iguais\n");
		} else {
			System.out.println("\nSão diferentes\n");
		}
		
		f2.mostra();
		
		
	}
	
}
