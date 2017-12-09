package quest04TEORICA;

public class Acumulacao {
	
	void x(double valor){
		valor = valor + valor; // problemática: a variavel, ao invés de receber o valor toda vez que o metodo for chamado, está simplesmente recebendo a soma do valor repassado.
	}
	
//	O CORRETO SERIA:
//
//	void x(double valor){
//		valor += valor;
//	}
	
}
