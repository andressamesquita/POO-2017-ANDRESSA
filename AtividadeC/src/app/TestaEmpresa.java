package app;


import model.*;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa e = new Empresa("Oi","1234143",10);
		
		for (int i = 0; i < 9; i++) {
			Funcionario f = new Funcionario("12312344");
			f.setNome("Fulano " + i);
			f.setCpf("123456");
			f.setSalario(i*10);
			f.setDepartamento("Diaspa");
			f.setDataDeEntradaNoBanco(new Data(10,10,2018));
			e.adiciona(f);
		}
		
		Funcionario f = new Funcionario("123423");
		f.setNome("Blastoise");
		f.setCpf("123456");
		f.setSalario(410);
		f.setDepartamento("Diaspa");
		f.setDataDeEntradaNoBanco(new Data(10,10,2018));
		e.adiciona(f);
		e.mostraEmpregados();
		System.out.println(e.contem(f));
		
		
	}


}
