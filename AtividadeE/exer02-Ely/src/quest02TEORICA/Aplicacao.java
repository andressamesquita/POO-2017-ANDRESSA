package quest02TEORICA;

public class Aplicacao {

	public static void main(String[] args) {
		
		//int contador;
		
		//System.out.println(contador++);
		
		/*
		 * O programa acima n�o compila porque a vari�vel contador nao foi inicializada, gerando erro.
		 * Para funcionar, basta atribuir um valor a mesma. O resultado ser�, primeiro, o valor atribuido, 
		 * por�m, depois ser� somado 1 no valor atual.
		 * 
		 * Corrigindo:
		 */
		
		int contador = 9;
		
		System.out.println(contador++);
		
		//somando 1 ao valor atual
		System.out.println(contador++);
		System.out.println(contador++);
		
	}

}
