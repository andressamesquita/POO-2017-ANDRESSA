package quest02TEORICA;

public class Aplicacao {

	public static void main(String[] args) {
		
		//int contador;
		
		//System.out.println(contador++);
		
		/*
		 * O programa acima não compila porque a variável contador nao foi inicializada, gerando erro.
		 * Para funcionar, basta atribuir um valor a mesma. O resultado será, primeiro, o valor atribuido, 
		 * porém, depois será somado 1 no valor atual.
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
