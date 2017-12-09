package appQuest05;
import modelQuest05.*;

public class TestaRadio {

	public static void main(String[] args) {
		
	//	Radio r = new Radio();
	//	r.volume = 10;
	}
	
	//Erro: o valor do atributo volume nao esta sendo passado no construtor.
	
	//O CORRETO SERIA:
	Radio r = new Radio(10);
}
