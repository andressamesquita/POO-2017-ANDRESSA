package quest04TEORICA;

public class Acumulacao {
	
	void x(double valor){
		valor = valor + valor; // problem�tica: a variavel, ao inv�s de receber o valor toda vez que o metodo for chamado, est� simplesmente recebendo a soma do valor repassado.
	}
	
//	O CORRETO SERIA:
//
//	void x(double valor){
//		valor += valor;
//	}
	
}
